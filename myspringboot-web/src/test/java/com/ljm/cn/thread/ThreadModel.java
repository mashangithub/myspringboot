package com.ljm.cn.thread;

/**
 * @author lijms
 * @date 2021/4/3/003 11:13
 */
public class ThreadModel implements Runnable {
    private int a;

    /**
     * synchronized锁和共享资源的使用
     */
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ":" + a);
        synchronized (ThreadModel.class) {
            try {
                Thread.sleep(10L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            a = a + 100;
            System.out.println(Thread.currentThread().getName() + ":" + a);
        }

    }

    public static void main(String[] args) {
        ThreadModel threadModel = new ThreadModel();

//        Thread thread1 = new Thread(threadModel, "thread1");
//        thread1.start();
//        Thread thread2 = new Thread(threadModel, "thread2");
//        thread2.start();

        for (int i = 0; i < 10; i++) {
            Thread thread1 = new Thread(threadModel, "thread" + i);
            thread1.start();

//            thread1.join();
//            thread1.interrupt();
//            thread1.isInterrupted();
        }

        Thread.interrupted();
    }
}
