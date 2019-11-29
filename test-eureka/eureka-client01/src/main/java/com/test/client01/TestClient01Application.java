package com.test.client01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TestClient01Application {
    public static void main(String[] args) {
        SpringApplication.run(TestClient01Application.class);
    }
}
