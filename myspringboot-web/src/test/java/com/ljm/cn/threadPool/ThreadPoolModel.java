package com.ljm.cn.threadPool;

import com.google.common.util.concurrent.MoreExecutors;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author lijms
 * @date 2021/4/5/005 0:15
 */
public class ThreadPoolModel {

    public static void main(String[] args) {
//        new ThreadPoolExecutor()

//        Executors.newCachedThreadPool();
        //获取cpu的个数
        int i = Runtime.getRuntime().availableProcessors();
        System.out.println(i);

        //创建线程池
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                10,
                30,
                5,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        //执行某个任务
//        executor.execute();
//        executor.submit()
//        executor.invokeAll()

        AtomicInteger atomicInteger = new AtomicInteger();

//        MoreExecutors.listeningDecorator()

//        CompletableFuture.runAsync()



    }

}
