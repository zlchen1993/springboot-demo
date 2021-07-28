package com.springboot.demo.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:test.properties")
@ConfigurationProperties(prefix = "my")
@Configuration
@Getter
@Setter
public class TestConfigBean {
    private String name;
    private int age;
}
