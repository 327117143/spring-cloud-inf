package com.kolema.infrabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * rabbit mq run class
 *
 * @author ware zhang
 * @date 2018/07/30
 */
//@EnableEurekaClient
@SpringBootApplication
public class InfRabbitmqApplication {

    public static void main(String[] args) {
        SpringApplication.run(InfRabbitmqApplication.class, args);
    }

}
