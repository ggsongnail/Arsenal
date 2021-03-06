package com.arms.ak47;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.arms.ak47.mapper")
@EnableDiscoveryClient
public class Ak47Application {
    public static void main(String[] args) {
        SpringApplication.run(Ak47Application.class,args);
    }
}
