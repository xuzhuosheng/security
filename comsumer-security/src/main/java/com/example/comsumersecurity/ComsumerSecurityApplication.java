package com.example.comsumersecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ComsumerSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComsumerSecurityApplication.class, args);
    }

}
