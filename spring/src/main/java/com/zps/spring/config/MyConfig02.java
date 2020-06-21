package com.zps.spring.config;

import com.zps.spring.pojo.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by zps on 2020/2/18 20:58
 */
@Configuration
public class MyConfig02 {

    @Scope("prototype")
    @Bean
    public Person person() {
        System.out.println("构建Person");
        return new Person("Lisi");
    }
}
