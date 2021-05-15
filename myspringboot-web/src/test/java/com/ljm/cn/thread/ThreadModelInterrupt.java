package com.ljm.cn.thread;

import java.util.concurrent.TimeUnit;

/**
 * @author lijms
 * @date 2021/4/3/003 18:00
 */
public class ThreadModelInterrupt implements Runnable{

    /**
     * sleep和Interrupt的结合使用
     */
    @Override
    public void run() {

        while (true){

            Thread thread = Thread.currentThread();

            try {
                TimeUnit.SECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
                //需要设置中断标示位
                thread.interrupt();
            }

            if(thread.isInterrupted()){
                System.out.println("我要退出了");
                break;
            }

        }

    }


    public static void main(String[] args) {
        ThreadModelInterrupt threadModelInterrupt = new ThreadModelInterrupt();
        Thread model1 = new Thread(threadModelInterrupt, "model1");

        //可以设置线程是否为守护线程
//        model1.setDaemon(true);

        model1.start();

        model1.interrupt();

//        threadModelInterrupt

    }



}
