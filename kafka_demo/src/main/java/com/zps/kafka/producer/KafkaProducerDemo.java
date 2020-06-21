package com.zps.kafka.producer;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Properties;

/**
 * Created by zps on 2020/6/7 18:47
 */
@Component
@PropertySource("classpath:producer.properties")
public class KafkaProducerDemo {

    @Value("${kafka.bootstrap.servers}")
    private String host;
    @Value("${kafka.acks}")
    private String acks;
    @Value("${kafka.key.serializer}")
    private String keySericalizer;
    @Value(" ${kafka.value.serializer}")
    private String valueSerializer;


    private Properties props;


    @PostConstruct
    public void init() {
        props = new Properties();
        props.put("bootstrap.servers", host);
        //props.put("acks", acks);
        props.put("key.serializer", keySericalizer);
        props.put("value.serializer", valueSerializer);
    }

    public void send(String name) {
        System.out.println("name :" + name);
        Producer<String, String> producer = new KafkaProducer<String, String>(props);
        producer.send(new ProducerRecord<>("event", "name", name));
        producer.close();
        System.out.println("生产成功 name :" + name);
    }
}
