package com.example.multiple.controller;

import com.example.multiple.dto.BoardDto;
import com.example.multiple.dto.FileDto;
import com.example.multiple.mappers.BoardMapper;
import com.example.multiple.mappers.ConfigMapper;
import com.example.multiple.service.BoardService;
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
import java.util.List;
import java.util.UUID;

@Controller
public class BoardController {

    @Autowired
    ConfigMapper configMapper;

    @Autowired
    BoardMapper boardMapper;

    @Value("${fileDir}")
    String fileDir;

    @Autowired
    BoardService boardService;

    @GetMapping("/board/boardList")                                                                             // page가 없다면 1로 처리
    public String getBoardList(@RequestParam String configCode, Model model, @RequestParam(value="page", defaultValue = "1") int page, @RequestParam(value = "searchType", defaultValue = "") String searchType, @RequestParam(value = "words", defaultValue = "") String words) {
        model.addAttribute("configCode", configCode);

        model.addAttribute("board", boardService.getBoardList(configCode, page, searchType, words));
        model.addAttribute("config", configMapper.getBoardConfig(configCode));
        System.out.println(boardService.PageInfo(configCode, page, searchType, words));
        model.addAttribute("page", boardService.PageInfo(configCode, page, searchType, words));
        System.out.println(searchType);
        System.out.println(words);

        String searchQuery = boardService.getSearch(searchType, words);

        boardMapper.getBoardCount(configCode, searchQuery);
        return "board/boardList";
    }

    @GetMapping("/board/boardWrite")
    public String getBoardWrite(@RequestParam String configCode, Model model) {
        model.addAttribute("configCode", configCode);
        return "board/boardWrite";
    }

    @PostMapping("/board/boardWrite")
    public String setBoardWrite(@ModelAttribute BoardDto boardDto, @RequestParam("files") List<MultipartFile> files) throws IOException {

        System.out.println(boardDto);

        int grp = boardService.getGrpMaxCnt(boardDto.getConfigCode());

        System.out.println("before : " + boardDto);
        boardDto.setGrp(grp);
        System.out.println("after : " + boardDto);



        if ( !files.get(0).isEmpty() ) {
            boardDto.setIsFiles("Y");
            boardService.setBoard(boardDto);
            int fileID = boardDto.getId();

            // 20231207
            String folderName = new SimpleDateFormat("yyyyMMdd").format(System.currentTimeMillis());

            System.out.println(folderName);

            File makeFolder = new File(fileDir + folderName);
            if (!makeFolder.exists()) {
                makeFolder.mkdir();
            }

            FileDto fileDto = new FileDto();
            for(MultipartFile mf : files) {
                System.out.println("filename");
                // 경로명 + uuid
                String savedPathName = fileDir + folderName;

                String originalName = mf.getOriginalFilename();
                String ext = originalName.substring(originalName.lastIndexOf("."));
                String uuid = UUID.randomUUID().toString();
                String savedFileName = uuid + ext;

                mf.transferTo(new File(savedPathName + "/" + savedFileName));

                fileDto.setConfigCode(boardDto.getConfigCode());
                fileDto.setId(fileID);
                fileDto.setOrgName(originalName);
                fileDto.setSavedFileName(savedFileName);
                fileDto.setSavedPathName(savedPathName);
                fileDto.setFolderName(folderName);
                fileDto.setExt(ext);

                boardService.setFiles(fileDto);
            }


        } else {
            boardService.setBoard(boardDto);
        }


        // return "redirect:/board/boardList?configCode="+configCode;
        return "redirect:/board/boardList?configCode="+boardDto.getConfigCode();
    }

    @GetMapping("/board/boardView")
    public String getBoardView(@RequestParam String configCode, @RequestParam int id, Model model, @ModelAttribute FileDto fileDto) {

        model.addAttribute("configCode", configCode);

        model.addAttribute("board", boardService.getBoard(configCode, id));
        model.addAttribute("files", boardService.getFiles(configCode, id));
        return "board/boardView";
    }

    @GetMapping("/board/boardDelete")
    public String getBoardDelete(@ModelAttribute BoardDto boardDto) {

        if (!boardDto.getConfigCode().isEmpty() && boardDto.getId() > 0) {
            boardService.getBoardDelete(boardDto); // 내용

            // 파일 삭제
            List<FileDto> files = boardService.getFiles(boardDto.getConfigCode(), boardDto.getId());
            for(FileDto fd: files) {
                File file = new File(fd.getSavedPathName() + "/" + fd.getSavedFileName());
                file.delete();
            }

            // 파일 디비
            boardService.setFilesDelete(boardDto);
        }

        return "redirect:/board/boardList?configCode="+boardDto.getConfigCode();
    }

//    @GetMapping("/board/download")
//    // Resource -> springframework.core.io import
//    public ResponseEntity<Resource> getDownload(@RequestParam String configCode, @RequestParam String savedFileName) throws MalformedURLException {
//        // System.out.println(configCode);
//        // System.out.println(savedFileName);
//
//        // uuid + ext
//
//
//        FileDto fd = boardMapper.getFile(configCode, savedFileName);
//        // System.out.println(fd.getOrgName());
//
//        // uuid.jpg => bg-1.jpg로 바꿔서 다운로드하기
//        String extName = savedFileName.substring(savedFileName.lastIndexOf("."));
//        // System.out.println(extName);
//        String fileName = fd.getOrgName().substring(0, fd.getOrgName().indexOf("."));
//        System.out.println(fileName);
//
//        String downloadFile = fileName + extName;
//        System.out.println(downloadFile);
//
//        // UrlResource resorce = new UrlResource("file:" + ); // http: 과 비슷한 문법
//        UrlResource resource = new UrlResource("file:" + fd.getSavedPathName() + "/" + fd.getSavedFileName());
//
//        // 한글 깨짐 방지하기위해 인코딩하기, 표준캐릭터셋 utf-8로 설정하기
//        String encodeFileName = UriUtils.encode(downloadFile, StandardCharsets.UTF_8);
//        String contentDisposition = "attachment; filename=\"" + encodeFileName + "\"" ;
//
//        return ResponseEntity.ok()
//                .header(HttpHeaders.CONTENT_DISPOSITION, contentDisposition)
//                .body(resource);
//    }
    @GetMapping("/board/download")
    public ResponseEntity<Resource> getDownload(
            @RequestParam String configCode,
            @RequestParam String savedFileName) throws MalformedURLException {

        FileDto fd = boardMapper.getFile(configCode, savedFileName);

        String fileName = fd.getOrgName().substring(0, fd.getOrgName().indexOf("."));
        String extName = savedFileName.substring(savedFileName.lastIndexOf("."));
        String downloadFile = fileName + extName;

        UrlResource resource = new UrlResource("file:" + fd.getSavedPathName() + "/" + fd.getSavedFileName());
        String encodeFileName = UriUtils.encode(downloadFile, StandardCharsets.UTF_8);
        String contentDisposition = "attachment; filename=\"" + encodeFileName + "\"" ;

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, contentDisposition)
                .body(resource);
    }
}
