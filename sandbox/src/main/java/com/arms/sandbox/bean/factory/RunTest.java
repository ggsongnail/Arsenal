package com.arms.sandbox.bean.factory;

import com.arms.sandbox.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        //通过bean工厂的id去获取只是获取到它getObject返回的对象
        Object obj = annotationConfigApplicationContext.getBean("myFactoryBean");
        //要获取bean工厂对象本身，需要在id前加&或者直接用getBean(class)的方法
        Object _obj = annotationConfigApplicationContext.getBean("&myFactoryBean");
        Object __obj = annotationConfigApplicationContext.getBean(MyFactoryBean.class);

        System.out.println("obj :"+obj);
        System.out.println("_obj :"+_obj);
        System.out.println("__obj :"+__obj);
    }
}
