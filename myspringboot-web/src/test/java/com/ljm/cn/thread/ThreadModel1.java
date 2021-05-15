package com.ljm.cn.thread;

/**
 * @author lijms
 * @date 2021/4/3/003 23:55
 */
public class ThreadModel1 {
    static int num = 0;

    public static synchronized void m1() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName());
            num++;
        }
    }

    public static class T1 extends Thread {

        public T1(String name) {
            super(name);
        }

        @Override
        public void run() {
            ThreadModel1.m1();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        T1 t1 = new T1("111");
        T1 t2 = new T1("222");
        T1 t3 = new T1("333");
        t1.start();
        t2.start();
        t3.start();
        //等待3个线程结束打印num
        t1.join();
        t2.join();
        t3.join();
        System.out.println(ThreadModel1.num);
    }
}