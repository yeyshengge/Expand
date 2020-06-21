package com.zps.spring.config;

import com.zps.spring.filter.MyFilter;
import com.zps.spring.pojo.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.swing.*;

/**
 * Created by zps on 2020/2/18 20:01
 */
//@Component
@ComponentScan(value = "com.zps.spring", useDefaultFilters = false,
        includeFilters = {
                //  @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class}),
                @ComponentScan.Filter(type = FilterType.CUSTOM, classes = MyFilter.class)
        }
)
public class MyConfig {

    @Bean
    public Person person() {
        return new Person("张三");
    }

}
