package com.example.tut04.controller;

import com.example.tut04.dto.RegDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class RegController {

    @GetMapping("/users/register")
    public String getReg() {
        return "users/register";
    }

    @PostMapping("/users/register")
    @ResponseBody
    public Map<String, Object> setReg(@ModelAttribute RegDto regDto) {
        System.out.println(regDto);
        System.out.println(regDto.toString());

//        Map<String, Object> map = new HashMap<>();
//        if(regDto != null) {
//            map.put("msg", "회원정보가 전송됨)
//        }
//        return map

//        return Map.of("msg", "데이터전송이 완료됨");

        // 200(ok), 500(server error)
        Map<String, Object> map = new HashMap<>();
        map.put("status", "200");

        return map;
    }
}
