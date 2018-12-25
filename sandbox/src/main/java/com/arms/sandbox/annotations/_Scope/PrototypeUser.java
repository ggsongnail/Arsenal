package com.arms.sandbox.annotations._Scope;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;

import javax.annotation.PreDestroy;

@Scope(value = "prototype")
@Getter
@Setter
public class PrototypeUser {
    private int id;
    private String name;


    public PrototypeUser(){
        System.out.println("构造函数");
    }

    public void initUser(){
        System.out.println("初始化bean前执行");
    }

    @PreDestroy
    public void destroyUser(){
        System.out.println("bean销毁后执行");
    }
}
