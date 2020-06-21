package com.zps.comsumer.config;

import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zps on 2020/5/23 19:30
 */
@Configuration
public class UserFeignConfig {
    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }
}
