package com.example.board.controller;

import com.example.board.dto.BoardDto;
import com.example.board.mappers.BoardMapper;
import com.example.board.service.BoardService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.UriUtils;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.UUID;

@Controller
public class BoardController {

    @Autowired
    BoardMapper boardMapper;

    @Autowired
    BoardService boardService;

    @Value("${fileDir}")
    String fileDir;

    @GetMapping("/board/list")
    public String getList(Model model, @RequestParam(value="searchType", defaultValue = "") String searchType, @RequestParam(value = "words", defaultValue = "") String words) {

//        model.addAttribute("cnt", boardMapper.getListCount());
//        model.addAttribute("list", boardMapper.getList());

        model.addAttribute("cnt", boardService.getSearchCnt(searchType, words));
        model.addAttribute("list", boardService.getSearch(searchType, words));

        System.out.println(searchType);
        System.out.println(words);

        boardService.getSearch(searchType, words);

        return "board/list.html";
    }

    @GetMapping("/board/write")
    public String getWrite() {
        return "board/write.html";
    }

    @PostMapping("/board/write")
    public String setWrite(@ModelAttribute BoardDto boardDto, @RequestParam("file") MultipartFile mf) throws IOException {
        System.out.println(boardDto.toString());
        // mf.getOriginalFilename();
        // mf.getSize();

        // 객체에 넣고 디비에 넣기

//        String OriginalName = mf.getOriginalFilename();
//
//        boardDto.setOriginalName(OriginalName);
//        boardDto.setSavedFileSize(mf.getSize());
//
//
//
//        String uuid = UUID.randomUUID().toString();
//
//        String ext = OriginalName.substring(OriginalName.lastIndexOf("."));
//
//        String savedFileName = uuid + ext;
//
//        String savedFilePathName = fileDir + savedFileName;
//
//        boardDto.setSavedFileName(savedFileName);
//        boardDto.setSavedFilePathName(savedFilePathName);
//
//        String folderName = new SimpleDateFormat("yyyyMMdd").format(System.currentTimeMillis());
//        boardDto.setFolderName(folderName);
//
//        System.out.println(boardDto.toString());
//        // grp 값이 0으로 출력됨 -> mapper끌고오기
//
//        boardMapper.getMaxGrp(); // maxGrp = 기본값 1로 설정
//        int maxGrp = boardMapper.getMaxGrp();
//
//        boardDto.setGrp(maxGrp); // boardDto에 grp값을 maxGrp로 설정
//        System.out.println(boardDto.toString());

        if (!mf.isEmpty()) {

            String folderName = new SimpleDateFormat("yyyyMMdd").format(System.currentTimeMillis());
            File makeFolder = new File(fileDir + folderName);

            if (!makeFolder.exists()) {
                makeFolder.mkdir();
            }

            String OriginalName = mf.getOriginalFilename();
            String uuid = UUID.randomUUID().toString();
            String ext = OriginalName.substring(OriginalName.lastIndexOf("."));
            String savedFileName = uuid + ext;
            String savedFilePathName = fileDir + folderName + "/" + savedFileName;

            boardDto.setOriginalName(OriginalName);
            boardDto.setSavedFileSize(mf.getSize());
            boardDto.setSavedFileName(savedFileName);
            boardDto.setSavedFilePathName(savedFilePathName);
            boardDto.setFolderName(folderName);
            boardDto.setExt(ext);

            System.out.println(boardDto.toString());
            // grp 값이 0으로 출력됨 -> mapper끌고오기

            mf.transferTo(new File(savedFilePathName));
        }

        // boardMapper.getMaxGrp(); // maxGrp = 기본값 1로 설정
        int maxGrp = boardMapper.getMaxGrp();

        boardDto.setGrp(maxGrp); // boardDto에 grp값을 maxGrp로 설정
        System.out.println(boardDto.toString());

        boardMapper.setWrite(boardDto);

        return "redirect:/board/list";
    }

    @GetMapping("/board/view")
    public String getView(@RequestParam int id, Model model) {
        System.out.println(id);
        boardMapper.updateVisit(id);

        model.addAttribute("view", boardMapper.getView(id));
        return "board/view.html";
    }

    @GetMapping("/download")
    public ResponseEntity<Resource> getDownload(@RequestParam String filename) throws MalformedURLException {
        System.out.println(filename);
        UrlResource resource = new UrlResource("file:" + filename);
        // encode() : 변환, decode() : 비변환
        String encodedFileName = UriUtils.encode(filename, StandardCharsets.UTF_8);
        String contentDisposition = "attachment; filename=\"" +encodedFileName+ "\"";
        // 메소드 타입을 ResponseEntity<Resource> 로 바꾸기

//        return "upload/uploadView";
        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, contentDisposition).body(resource);
    }

    @GetMapping("/board/delete")
    public String getDelete(@RequestParam int id) {
        boardService.getDelete(id);
        return "redirect:/board/list";
    }

    @GetMapping("/board/reply")
    public String getReply(@RequestParam int id, Model model) {
        System.out.println(id);
        BoardDto b = boardMapper.getView(id);
        System.out.println(b.getContent());

        model.addAttribute("reply", b);
        return "board/reply";
    }

    @PostMapping("/board/reply")
    public String setReply(@ModelAttribute BoardDto boardDto, @RequestParam("file") MultipartFile mf) throws IOException {


        /* grp(게시물그룹), seq(답글순서), depth(들여쓰기) */

        System.out.println(boardDto.getId());
        
        // 원본글
        // 1, 1, 1
        BoardDto bd = boardMapper.getView(boardDto.getId());

        // 답글
        // 1, 2, 2
        boardDto.setGrp(bd.getGrp());
        boardDto.setSeq(bd.getSeq() + 1);
        boardDto.setDepth(bd.getDepth() + 1);

        System.out.println("원본글 : " + bd.getGrp());
        System.out.println("원본글 : " + bd.getSeq());
        System.out.println("원본글 : " + bd.getDepth());

        System.out.println("답글 : " + boardDto);

        boardMapper.setReply(boardDto);


        return "redirect:/board/list";
    }


}
