package com.arms.ak47_8082;

import com.arms.ak47.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.arms.ak47")
@MapperScan(basePackages = "com.arms.ak47.mapper")
@EnableDiscoveryClient
public class Ak47_8082Application {
    public static void main(String[] args) {
        SpringApplication.run(Ak47_8082Application.class,args);
    }

}
