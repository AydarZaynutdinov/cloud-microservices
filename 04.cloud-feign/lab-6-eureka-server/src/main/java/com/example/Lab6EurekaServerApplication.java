package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Lab6EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab6EurekaServerApplication.class, args);
    }

}
