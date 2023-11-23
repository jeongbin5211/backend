package com.example.upload.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
public class UploadController {

    @Value("${fileDir}")
    String fileDir;
    @GetMapping("/upload")
    public String getUpload() {
        return "upload/upload";
    }

    @PostMapping("/upload")
    public String setUpload(@RequestParam("file") MultipartFile file, Model model) throws IOException {
//        System.out.println(file.getOriginalFilename());
//        System.out.println(file.getSize() / 1000 + "kb");
        
        // 파일 중복 -> 변경(uuid) -> 확장자 기준으로 배열 0 -> uuid 변경하여 저장
//        UUID 임의의 난수 생성
//        String uuid1 = String.valueOf(UUID.randomUUID());
//        String uuid = UUID.randomUUID().toString();
//        System.out.println(uuid);

        System.out.println(file.getOriginalFilename());
        String origName = file.getOriginalFilename();
        // .을 기준으로 자르기
        // .을 기준으로 indexOf(".") 자르기 substring
        origName.lastIndexOf(".");
        System.out.println(origName.lastIndexOf("."));

        String ext = origName.substring(origName.lastIndexOf("."));
        System.out.println(ext);

        String uuid = UUID.randomUUID().toString();

        String fileName = uuid + ext;
        System.out.println(fileName);

        // 경로뒤에 파일이름 바로나와서 / 추가
//        String fileDir = "D:/hjb-backend/web/spring/1123/upload/src/main/resources/static/upload/";
//        @Value : properties에서 끌어쓰기
//        @Value("${fileDir}")
//        String fileDir;

        String savePathFile = fileDir + fileName;
        System.out.println(savePathFile);

        file.transferTo(new File(savePathFile));

        model.addAttribute("filename", fileName);
//        return "upload/upload";
        return "upload/view";
    }

    @GetMapping("/view")
    public String getView() {
        return "upload/view";
    }
}
