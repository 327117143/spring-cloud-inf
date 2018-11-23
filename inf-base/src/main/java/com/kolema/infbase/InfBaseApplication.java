package com.kolema.infbase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class InfBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(InfBaseApplication.class, args);
    }
}
