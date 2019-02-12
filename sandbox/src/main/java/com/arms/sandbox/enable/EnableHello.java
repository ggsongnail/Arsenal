package com.arms.sandbox.enable;

import com.arms.sandbox.config.MainConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(MainConfig.class)
//@Import(HelloImportSelector.class)
public @interface EnableHello {
}
