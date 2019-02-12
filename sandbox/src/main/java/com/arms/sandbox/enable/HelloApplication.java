package com.arms.sandbox.enable;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@EnableHello
public class HelloApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = new SpringApplicationBuilder(HelloApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
        String[] beanNames = configurableApplicationContext.getBeanDefinitionNames();
        for(String name:beanNames){
            System.out.println("bean 名称: " + name);
        }
        configurableApplicationContext.close();
    }
}
