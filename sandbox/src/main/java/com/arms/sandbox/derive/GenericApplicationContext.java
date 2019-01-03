package com.arms.sandbox.derive;

public class GenericApplicationContext extends AbstractApplicationContext {

    @Override
    protected void refreshBeanFactory() {
        System.out.println("genericApplicationContext run refreshBeanFactory");
    }
}
