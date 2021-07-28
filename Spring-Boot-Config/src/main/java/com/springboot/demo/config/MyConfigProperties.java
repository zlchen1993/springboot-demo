package com.springboot.demo.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class MyConfigProperties {

    @Value("${my.application.name}")
    private String name;

    @Value("${my.application.title}")
    private String title;
}
