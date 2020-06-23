package com.zps.spring.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.MethodMetadata;

/**
 * Created by zps on 2020/6/23 22:04
 */
public class LinuxCondition implements Condition {
    /**
     * Determine if the condition matches.
     *
     * @param context  the condition context
     * @param metadata metadata of the {@link AnnotationMetadata class}
     *                 or {@link MethodMetadata method} being checked
     * @return {@code true} if the condition matches and the component can be registered,
     * or {@code false} to veto the annotated component's registration
     */
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //获取ioc容器的beanFactory
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        //获取环境对象
        Environment environment = context.getEnvironment();
        //获取类加载器
        ClassLoader classLoader = context.getClassLoader();
        //获取bean注册信息
        BeanDefinitionRegistry registry = context.getRegistry();
        if (environment.getProperty("os.name").contains("Linux")) {
            return true;
        }
        return false;
    }
}
