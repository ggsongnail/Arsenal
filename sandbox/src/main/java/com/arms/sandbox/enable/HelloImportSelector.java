package com.arms.sandbox.enable;

import com.arms.sandbox.config.MainConfig;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class HelloImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{MainConfig.class.getName()};
    }
}
