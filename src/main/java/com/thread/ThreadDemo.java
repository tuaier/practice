package com.thread;

/**
 * @author kangfw5
 * @since 2020-07-31
 */
public class ThreadDemo {
    private static Object rs1 = new Object();
    private static Object rs2 = new Object();

    public static void main(String[] args) {

        System.out.println("Hello world");
       /* Thread th1 = new Thread(()->{
            System.out.println("线程1 ID：" + Thread.currentThread().getId() + " NAME：" + Thread.currentThread().getName());
            synchronized (rs1) {
                System.out.println("线程1 ID：" + Thread.currentThread().getId() + " NAME：" + Thread.currentThread().getName() + "获取到资源1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程1 ID：" + Thread.currentThread().getId() + " NAME：" + Thread.currentThread().getName() + "等待获取资源2");
                synchronized (rs2) {
                    System.out.println("线程1 ID：" + Thread.currentThread().getId() + " NAME：" + Thread.currentThread().getName() + "获取到资源2");
                }
            }
        }, "A1");

        Thread th2 = new Thread(()->{
            System.out.println("线程2 ID：" + Thread.currentThread().getId() + " NAME：" + Thread.currentThread().getName());
            synchronized (rs2) {
                System.out.println("线程2 ID：" + Thread.currentThread().getId() + " NAME：" + Thread.currentThread().getName() + "获取到资源2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程2 ID：" + Thread.currentThread().getId() + " NAME：" + Thread.currentThread().getName() + "等待获取资源1");
                synchronized (rs1) {
                    System.out.println("线程2 ID：" + Thread.currentThread().getId() + " NAME：" + Thread.currentThread().getName() + "获取到资源1");
                }
            }
        }, "A2");
        th1.start();
        th2.start();
        try {
            th1.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }
}
