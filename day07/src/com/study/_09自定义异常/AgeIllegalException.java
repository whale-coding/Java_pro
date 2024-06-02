package com.study._09自定义异常;

/**
 * @Classname: AgeIllegalException
 * @Date: 2024/6/2 23:26
 * @Author: 聂建强
 * @Description: 自定义编译时异常类：1.继承Exception 2.重写构造器
 */
public class AgeIllegalException extends Exception{
    public AgeIllegalException() {
    }
    // 一般是使用这个构造器，重写这个即可
    public AgeIllegalException(String message) {
        super(message);
    }

    public AgeIllegalException(String message, Throwable cause) {
        super(message, cause);
    }

    public AgeIllegalException(Throwable cause) {
        super(cause);
    }

    public AgeIllegalException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
