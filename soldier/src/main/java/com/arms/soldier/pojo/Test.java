package com.arms.soldier.pojo;

public class Test {
    public static void main(String[] args) {
        User user = new User();
        Apple apple = new Apple();
        apple.setColor("red");
        apple.setAmount(1);
        user.setName("hello");
        user.setApple(apple);
        Apple greenApple = user.getApple();
        greenApple.setColor("green");
        System.out.println(user.getApple().getColor());
    }
}
