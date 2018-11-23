package com.kolema.infeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka server application run class
 *
 * @author ware zhang
 * @date 2018/07/27
 */
@EnableEurekaServer
@SpringBootApplication
public class InfEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(InfEurekaServerApplication.class, args);
    }
}
