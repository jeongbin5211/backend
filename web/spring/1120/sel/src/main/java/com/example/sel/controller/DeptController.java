package com.example.sel.controller;

import com.example.sel.dto.DeptDto;
import com.example.sel.dto.PosDto;
import com.example.sel.mappers.DeptMapper;
import com.example.sel.mappers.PosMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DeptController {

//    DeptMapper deptMapper = new DeptMapper() {}
    @Autowired
    DeptMapper deptMapper;

    @Autowired
    PosMapper posMapper;

    @GetMapping("/dept/sel")
    public String getSel() {
        return "dept/sel.html";
    }

    @PostMapping("/dept/sel")
    @ResponseBody
    public Map<String, Object> setDept() {

        Map<String, Object> map = new HashMap<>();
        map.put("dept", deptMapper.getDeptAll());

//        deptMapper.getDeptAll();
        return map;
    }

    @PostMapping("/dept/addDept")
    @ResponseBody
    public Map<String, Object> addDept(@ModelAttribute DeptDto deptDto) {
        System.out.println(deptDto.getDeptCode());
        System.out.println(deptDto.getDeptName());
//        deptMapper.addDept(deptDto);
//        보내줄때는 값만보냄

        Map<String, Object> map = new HashMap<>();
        if (deptDto != null) {
            deptMapper.addDept(deptDto);
            map.put("msg", "ok");
        }
        return map;
    }

    @GetMapping("/dept/multiple")
    public String getMulti() {
        return "dept/multiple.html";
    }

    @PostMapping("/pos/addPos")
    @ResponseBody
    public Map<String, Object> addPos(@ModelAttribute PosDto posDto) {
        System.out.println(posDto);

        Map<String, Object> map = new HashMap<>();
        if (posDto != null) {
            posMapper.addPos(posDto);
            map.put("msg", "ok");
        }
        return map;
    }

    @GetMapping("/selbox")
    public String getSelbox() {
        return "selbox";
    }

    @PostMapping("/pos/getPos")
    @ResponseBody
    public Map<String, Object> getPos(@RequestParam String deptCode) {
        System.out.println(deptCode);
        Map<String, Object> map = new HashMap<>();
        map.put("pos", posMapper.getPos(deptCode));
        return map;
    }
}
