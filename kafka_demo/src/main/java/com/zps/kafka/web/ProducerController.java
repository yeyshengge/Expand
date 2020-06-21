package com.zps.kafka.web;

import com.zps.kafka.producer.KafkaProducerDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zps on 2020/6/7 21:27
 */
@RestController
@RequestMapping("/kafka")
public class ProducerController {


    @Autowired
    private KafkaProducerDemo kafkaProducerDemo;

    @GetMapping("/producer")
    public String producer(String name) {
        System.out.println("----------------->"+name );
        try {
            kafkaProducerDemo.send(name);
            return "生产成功";
        } catch (Exception e) {
            e.printStackTrace();
            return "生产失败";
        }
    }
}
