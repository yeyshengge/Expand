package com.zps.exection.handle;

/**
 * Created by zps on 2020/3/4 20:53
 */
public class CustomException extends RuntimeException {

    Integer errorCode;

    public CustomException(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public Integer getErrorCode() {
        return errorCode;
    }
}
