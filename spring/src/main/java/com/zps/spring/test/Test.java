package com.zps.spring.test;

import com.zps.spring.config.MyConfig;
import com.zps.spring.config.MyConfig02;
import com.zps.spring.pojo.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by zps on 2020/2/18 20:03
 */
public class Test {

    @org.junit.Test
    public void test01() {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(MyConfig.class);
        Person bean = app.getBean(Person.class);
        //获取容器所有的bean
        String[] beanDefinitionNames = app.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        // System.out.println(bean.getName());
    }


    @org.junit.Test
    public void test02() {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(MyConfig02.class);
        //Person bean = app.getBean(Person.class);

    }
}
