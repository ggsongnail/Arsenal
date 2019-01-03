package com.arms.sandbox.config;

import com.arms.sandbox.bean.annotations._Import.Circle;
import com.arms.sandbox.bean.annotations._Import.MyImportBeanDefinitionRegistar;
import com.arms.sandbox.bean.annotations._Import.MyImportSelector;
import com.arms.sandbox.bean.annotations._Import.Square;
import com.arms.sandbox.bean.annotations._Scope.PrototypeUser;
import com.arms.sandbox.bean.annotations._Scope.SingletonUser;
import com.arms.sandbox.bean.beanPostProcessor.MyBeanPostProcessor;
import com.arms.sandbox.bean.factory.MyFactoryBean;
import org.springframework.context.annotation.*;

@Import({Circle.class,Square.class,MyImportSelector.class,MyImportBeanDefinitionRegistar.class})
@Configuration
public class MainConfig {

    //这里也可以用@Import来将对象放到spring ioc容器中
    @Bean
    public SingletonUser singletonUser(){
        return new SingletonUser();
    }

    //@Scope(value = "prototype") 这个模式下的destroyUser无效
    //initMethod 和 destroyMethod可以用@PostConstruct 和 @PreDestroy来替换 或者 类实现implements InitializingBean,DisposableBean接口
    @Bean(initMethod = "initUser",destroyMethod = "destroyUser")
    public PrototypeUser prototypeUser(){
        return new PrototypeUser();
    }

    @Bean
    public MyFactoryBean myFactoryBean(){
        return new MyFactoryBean();
    }

    @Bean
    public MyBeanPostProcessor myBeanPostProcessor(){
        return new MyBeanPostProcessor();
    }
}
