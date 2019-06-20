package com.example.providersecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProviderSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderSecurityApplication.class, args);
    }

}
