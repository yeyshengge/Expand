package com.zps.exection.handle;

/**
 * Created by zps on 2020/3/4 21:01
 */
public class CatchException {

    public static void cast(Integer code){
        throw new CustomException(code);
    }
}
