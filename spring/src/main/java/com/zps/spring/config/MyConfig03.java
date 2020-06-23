package com.zps.spring.config;

import com.zps.spring.condition.LinuxCondition;
import com.zps.spring.condition.MyImportBeanDefinitionRegistrar;
import com.zps.spring.condition.MyImportSelector;
import com.zps.spring.condition.WindowsCondition;
import com.zps.spring.pojo.Color;
import com.zps.spring.pojo.Person;
import org.springframework.context.annotation.*;
import org.springframework.validation.annotation.Validated;

/**
 * Created by zps on 2020/2/18 20:58
 */
@Configuration
@Import({Color.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
public class MyConfig03 {


    @Bean("bill")
    @Conditional(WindowsCondition.class)
    public Person person() {
        return new Person("Windows");
    }

    @Bean("linux")
    @Conditional(LinuxCondition.class)
    public Person person2() {
        return new Person("Linux");
    }
}
