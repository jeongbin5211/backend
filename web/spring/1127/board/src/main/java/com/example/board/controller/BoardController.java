package com.example.board.controller;

import com.example.board.dto.BoardDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

@Controller
public class BoardController {

    @Value("${fileDir}")
    String fileDir;

    @GetMapping("/board/list")
    public String getList() {
        return "board/list.html";
    }

    @GetMapping("/board/write")
    public String getWrite() {
        return "board/write.html";
    }

    @PostMapping("/board/write")
    public String setWrite(@ModelAttribute BoardDto boardDto, @RequestParam("file") MultipartFile mf) {
        System.out.println(boardDto.toString());
        // mf.getOriginalFilename();
        // mf.getSize();

        // 객체에 넣고 디비에 넣기

        String OriginalName = mf.getOriginalFilename();

        boardDto.setOriginalName(OriginalName);
        boardDto.setSavedFileSize(mf.getSize());



        String uuid = UUID.randomUUID().toString();

        String ext = OriginalName.substring(OriginalName.lastIndexOf("."));

        String savedFileName = uuid + ext;

        String savedFilePathName = fileDir + savedFileName;

        boardDto.setSavedFileName(savedFileName);
        boardDto.setSavedFilePathName(savedFilePathName);

        System.out.println(boardDto.toString());

        return "redirect:/board/list";
    }
}
