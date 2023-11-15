package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

//@Controller
@RestController
@RequestMapping("/hello")
public class TestController {

    @GetMapping("/welcome")
//    @ResponseBody
//    public String welcome() {
//        return "Welcome Busan It Academy";
//    };

    public Map<String, String> welcome() {
      return Map.of("userid", "koreait");
    };

    @GetMapping("/hi")
    public String hi() {
        return "hi";
    }
}
