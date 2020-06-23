package com.zps.spring.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Created by zps on 2020/6/23 22:44
 */
public class MyImportSelector implements ImportSelector {
    /**
     * Select and return the names of which class(es) should be imported based on
     * the {@link AnnotationMetadata} of the importing @{@link Configuration} class.
     *
     * @param importingClassMetadata
     */
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        //返回的全限定名代表要添加到容器中的bean
        return new String[]{"com.zps.spring.pojo.Red","com.zps.spring.pojo.Yellow"};
    }
}
