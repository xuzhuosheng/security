package com.example.comsumerwebsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ComsumerWebSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComsumerWebSecurityApplication.class, args);
    }

}
