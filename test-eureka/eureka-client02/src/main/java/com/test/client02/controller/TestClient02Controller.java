package com.test.client02.controller;

import com.netflix.discovery.converters.Auto;
import com.test.client02.api.Test01Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestClient02Controller {

    @Autowired
    private Test01Api test01Api;

    @RequestMapping("test02")
    public String test02(){

        System.out.println("=================testClient01================");
        String test01 = test01Api.testClient01();

        return test01;
    }
}
