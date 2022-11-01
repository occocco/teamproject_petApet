package com.teamproject.petapet;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 텍스트 에디터에 이미지를 업로드 했을 때 그 이미지가 바로 보일 수 있도록 하기 위해 생성. By.oh
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    private String connectPath = "/Users/seonghyeon/Desktop/test/**";
    private String connectPath2 = "/Users/seonghyeon/Desktop/test/**";
    private String resourcePath = "file:////Users/seonghyeon/Desktop/test/";
    private String resourcePath2 = "file:////Users/seonghyeon/Desktop/test/";

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(connectPath)
                .addResourceLocations(resourcePath);
        registry.addResourceHandler(connectPath2)
                .addResourceLocations(resourcePath2);
    }
}