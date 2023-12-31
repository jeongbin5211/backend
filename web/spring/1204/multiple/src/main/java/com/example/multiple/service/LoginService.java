package com.example.multiple.service;

import com.example.multiple.mappers.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    LoginMapper loginMapper;

    public String idCheck(String userid) {
        int result = loginMapper.IdCheck(userid);

        String str = "";
        if (result > 0) {
            str = "Can't use";
        }else {
            str = "ok";
        }

        return str;
    }

}
