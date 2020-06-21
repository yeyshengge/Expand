package com.zps.kafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;

/**
 * Created by zps on 2020/6/7 21:06
 */
@Component
@PropertySource("classpath:consumer.properties")
public class KafkaConsumerDemo1  {

    @Value("${kafka.bootstrap.servers}")
    private String host;
    @Value("${kafka.key.deserializer}")
    private String keyDesericalizer;
    @Value(" ${kafka.value.deserializer}")
    private String valueDeserializer;

    private static final String GROUP = "group1";

    private Properties props;

    @PostConstruct
    public void init() {
        props = new Properties();
        props.put("bootstrap.servers", host);
        props.put("group.id", GROUP);
        props.put("key.deserializer", keyDesericalizer);
        props.put("value.deserializer", valueDeserializer);


        KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(props);

        consumer.subscribe(Arrays.asList("event"));
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println(Thread.currentThread().getName());
                    ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(100));
                    for (ConsumerRecord<String, String> record : records) {
                        System.out.println(record.key());
                        System.out.println(record.topic());
                        System.out.println(record.offset());
                        System.out.println(record.value());
                        System.out.println(record.toString());
                    }
                }
            }
        }).start();
    }
}
