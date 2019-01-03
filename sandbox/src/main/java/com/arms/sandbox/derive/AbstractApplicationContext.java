package com.arms.sandbox.derive;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public abstract class AbstractApplicationContext {
    protected abstract void refreshBeanFactory();
    protected ConfigurableListableBeanFactory obtainFreshBeanFactory() {
        refreshBeanFactory();
        return null;
    }
}
