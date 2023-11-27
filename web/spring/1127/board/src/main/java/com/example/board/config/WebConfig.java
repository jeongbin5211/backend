package com.example.board.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        WebMvcConfigurer.super.addResourceHandlers(registry); -> 삭제해도됨
//        / : resources, ** : 모두
//        addResourceLocations("") : 경로는 src부터 적기 -> 내부 작업 경로 설정
//        addResourceLocations("file:///D:/temp/") : 외부 저장 경로 설정
        registry.addResourceHandler("/**")
                .addResourceLocations("file:src/main/resources/static/upload/")
                .addResourceLocations("file:///D:/temp/");
    }
}
