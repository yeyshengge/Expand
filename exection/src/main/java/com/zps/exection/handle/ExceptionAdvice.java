package com.zps.exection.handle;

import com.google.common.collect.ImmutableMap;
import com.sun.org.apache.bcel.internal.classfile.Code;
import com.zps.exection.handle.CustomException;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zps on 2020/3/4 20:56
 */
@ControllerAdvice
public class ExceptionAdvice {


    public static ImmutableMap<Class<? extends Throwable>, Integer> immutableMap;

    public static ImmutableMap.Builder<Class<? extends Throwable>, Integer> builder = ImmutableMap.builder();


    static {
        builder.put(HttpMessageNotReadableException.class, 200);
        builder.put(NullPointerException.class, 201);
    }

    @ExceptionHandler(CustomException.class)
    @ResponseBody
    public String customException(CustomException c) {
        return c.getErrorCode() + "";
    }


    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String customException(Exception e) {
        //如果为空就构建map
        if (immutableMap == null) {
            immutableMap = builder.build();
        }
        //如果能在map获取数据就返回信息
        if (immutableMap.get(e.getClass()) != null) {
            return immutableMap.get(e.getClass()) + "";
        }
        //map中没有统一返回999
        return 999 + "";
    }
}
