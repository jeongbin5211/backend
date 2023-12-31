package com.example.multiple.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // localhost:8888/**
        registry.addResourceHandler("/**")
                .addResourceLocations("file:src/main/resources/static/")
                .addResourceLocations("file:src/main/resources/static/upload/");
    }
}
