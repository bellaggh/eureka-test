package com.eureka.server01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TestServer01Application {
    public static void main(String[] args) {
        SpringApplication.run(TestServer01Application.class);
    }
}
