package com.zps.logback.web;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zps on 2020/6/8 22:11
 */
@Controller
@RequestMapping("/logback")
public class LogBackController {

    private static final Logger logger = LoggerFactory.getLogger(LogBackController.class);

    @RequestMapping("/{message}")
    public void method(@PathVariable("message") String message) {
        logger.error("this error message : {}", message);
        logger.warn("this warn message : {}", message);
        logger.info("this info message : {}", message);
        logger.debug("this debug message : {}", message);

        System.out.println(111);
        System.out.println(5 / 0);

    }
}
