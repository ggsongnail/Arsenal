package com.arms.eurekaserver10087;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer10087Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer10087Application.class,args);
    }
}
