package com.springboot.demo.controller;

import com.springboot.demo.config.ConfigBean;
import com.springboot.demo.config.MyConfigProperties;
import com.springboot.demo.config.TestConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    private MyConfigProperties configProperties;
    @Autowired
    private ConfigBean configBean;
    @Autowired
    private TestConfigBean testConfigBean;

    @RequestMapping("/properties")
    public String configPropertiesTest(){
        return configProperties.getName()+"==="+configProperties.getTitle();
    }
    @RequestMapping("/configbean")
    public String configBeanTest(){
        return configBean.getName()+"==="+configBean.getTitle()+"\n"+configBean.getWholeTitle();
    }
    @RequestMapping("/customer")
    public String testConfigBean(){
        return testConfigBean.getName()+":"+testConfigBean.getAge();
    }
}
