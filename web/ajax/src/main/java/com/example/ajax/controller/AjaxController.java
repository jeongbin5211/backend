package com.example.ajax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {

    @GetMapping("/hello1")
    @ResponseBody
    public String getHello() {
        return "Welcome Home1";
    }

    @GetMapping("/receive")
    @ResponseBody
    @CrossOrigin("*")
    public void getData(String userid, String passwd) {
        System.out.println(userid);
        System.out.println(passwd);
    }


}
