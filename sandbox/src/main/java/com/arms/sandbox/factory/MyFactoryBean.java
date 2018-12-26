package com.arms.sandbox.factory;

import com.arms.sandbox.annotations._Import.Circle;
import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean<Circle> {
    @Override
    public Circle getObject() throws Exception {
        return new Circle();
    }

    @Override
    public Class<?> getObjectType() {
        return Circle.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
