package com.zps.product.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zps on 2020/5/23 18:22
 */
@RequestMapping("/feign")
@RestController
public class FeignController {

    @RequestMapping("/{id}")
    public String getUserById(@PathVariable("id") String id) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "张三");
        map.put("2", "李四");
        return map.get(id);
    }
}
