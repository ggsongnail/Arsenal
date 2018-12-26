package com.arms.sandbox.bean.annotations._Import;

import com.arms.sandbox.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beanNames = configApplicationContext.getBeanDefinitionNames();
        for(String name:beanNames){
            System.out.println("bean 名称: " + name);
        }
    }
}
