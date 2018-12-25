package com.arms.sandbox.annotations._Scope;

import com.arms.sandbox.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunTest {
    public static void main(String[] args) {
        //Bean在实例化的过程中：Constructor > @PostConstruct >InitializingBean > init-method
        //Bean在销毁的过程中：@PreDestroy > DisposableBean > destroy-method
        //a.singleton单例模式 -- 全局有且仅有一个实例
        //b.prototype原型模式 -- 每次获取Bean的时候会有一个新的实例
        //c.request -- request表示该针对每一次HTTP请求都会产生一个新的bean，同时该bean仅在当前HTTP request内有效
        //d.session -- session作用域表示该针对每一次HTTP请求都会产生一个新的bean，同时该bean仅在当前HTTP session内有效
        //e.globalsession -- global session作用域类似于标准的HTTP Session作用域，不过它仅仅在基于portlet的web应用中才有意义
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        PrototypeUser prototypeUserA = annotationConfigApplicationContext.getBean(PrototypeUser.class);
        PrototypeUser prototypeUserB = annotationConfigApplicationContext.getBean(PrototypeUser.class);
        System.out.println(prototypeUserA.equals(prototypeUserB));
        SingletonUser singletonUserA = annotationConfigApplicationContext.getBean(SingletonUser.class);
        SingletonUser singletonUserB = annotationConfigApplicationContext.getBean(SingletonUser.class);
        System.out.println(singletonUserA.equals(singletonUserB));
        annotationConfigApplicationContext.close();
    }
}
