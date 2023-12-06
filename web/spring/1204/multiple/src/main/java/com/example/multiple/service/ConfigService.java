package com.example.multiple.service;

import com.example.multiple.dto.ConfigDto;
import com.example.multiple.mappers.ConfigMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConfigService {

    @Autowired
    ConfigMapper configMapper;

    public int checkConfigCode(String configCode) {// controller에서 넘어옴


        return configMapper.checkConfigCode(configCode); // mapper에서 실행하고 결과를 다시 여기로 가져옴
    }

    public void setConfig(ConfigDto configDto) {
        System.out.println("service: " + configDto.getConfigCode()); // controller에서 configDto를 넘겨줘야 출력됨

        configMapper.setConfig(configDto);
    }

    public List<ConfigDto> getConfigList() {
        return configMapper.getConfigList();
    }

    public void getColorChange(int id, String color) {
        System.out.println("service : " + id);
        configMapper.getColorChange(id, color);
    }

    public void deleteConfig(String configCode) {
        configMapper.deleteConfig(configCode);
    }

    public void makeBoard(String configCode) {
        configMapper.makeBoard(configCode);
    }

    public void makeFiles(String configCode) {
        configMapper.makeFiles(configCode);
    }

    public void makeComment(String configCode) {
        configMapper.makeComment(configCode);
    }

    public void dropBoard(String configCode) { //controller에서 받아옴
        configMapper.dropBoard(configCode);
    }

    public void dropFiles(String configCode) {
        configMapper.dropFiles(configCode);
    }

    public void dropComment(String configCode) {
        configMapper.dropComment(configCode);
    }
}
