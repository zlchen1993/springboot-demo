package com.springboot.demo.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "my.application")
@Configuration
@Setter
@Getter
public class ConfigBean {

    private String name;
    private String title;
    private String wholeTitle;
}
