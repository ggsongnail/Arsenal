package com.arms.sandbox.derive;

/**
 *
 */
public class MyApplicationContext extends GenericApplicationContext {
    public static void main(String[] args) {
        testDerive();
    }

    public static void testDerive(){
        MyApplicationContext myApplicationContext = new MyApplicationContext();
        //派生最底类可以使用抽象基类的方法，抽象基类的refreshBeanFactory方法实际调用的是直接父类GenericApplicationContext的refreshBeanFactory方法
        myApplicationContext.obtainFreshBeanFactory();
    }
}
