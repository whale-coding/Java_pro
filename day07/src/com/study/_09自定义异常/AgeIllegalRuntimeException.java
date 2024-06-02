package com.study._09自定义异常;

/**
 * @Classname: AgeIllegalRuntimeException
 * @Date: 2024/6/2 23:24
 * @Author: 聂建强
 * @Description: 自定义运行时异常类：1.继承RuntimeException 2.重写构造器
 */
public class AgeIllegalRuntimeException extends RuntimeException{
    public AgeIllegalRuntimeException() {
    }
    // 一般是使用这个构造器，重写这个即可
    public AgeIllegalRuntimeException(String message) {
        super(message);
    }

    public AgeIllegalRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public AgeIllegalRuntimeException(Throwable cause) {
        super(cause);
    }

    public AgeIllegalRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
