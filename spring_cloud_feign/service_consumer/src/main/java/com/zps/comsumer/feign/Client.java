package com.zps.comsumer.feign;

import com.zps.comsumer.config.UserFeignConfig;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zps on 2020/5/23 18:30
 */
@FeignClient(name = "product",configuration = UserFeignConfig.class)
public interface Client {


    @RequestLine("GET /feign/{id}")
    String getUserByLine(@Param("id") String id);

    //@RequestMapping("/feign/{id}")
    //String getUserById(@PathVariable("id") String id);

}
