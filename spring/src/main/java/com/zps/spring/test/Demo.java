package com.zps.spring.test;

import com.zps.spring.config.MyConfig;
import com.zps.spring.config.MyConfig02;
import com.zps.spring.config.MyConfig03;
import com.zps.spring.pojo.Person;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by zps on 2020/2/18 20:03
 */
public class Demo {

    private AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(MyConfig03.class);


    @Test
    public void test04() {
        String[] beanDefinitionNames = app.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }

    @Test
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


    @Test
    public void test02() {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(MyConfig02.class);
        //Person bean = app.getBean(Person.class);

    }

    @Test
    public void test03(){
        AnnotationConfigApplicationContext app  = new AnnotationConfigApplicationContext(MyConfig03.class);
        String[] beanDefinitionNames = app.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
