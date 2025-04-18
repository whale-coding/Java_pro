package com.study._07TCP通信四;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Classname: HandlerSocketThreadPool
 * @Date: 2024/6/10 09:36
 * @Author: 聂建强
 * @Description:
 */
// 线程池处理类
public class HandlerSocketThreadPool {
    // 线程池
    private ExecutorService executor;
    // 线程池：3个线程  100个
    public HandlerSocketThreadPool(int maxPoolSize, int queueSize){
        executor = new ThreadPoolExecutor(
                maxPoolSize,
                maxPoolSize,
                120L,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(queueSize) );
    }

    public void execute(Runnable task){
        this.executor.execute(task);
    }
}
