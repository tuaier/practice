package com.thread.lock;

import org.openjdk.jol.info.ClassLayout;

/**
 * @author kangfw5
 * @since 2020-08-03
 */
public class LockDemo {

    public static void main(String[] args) throws InterruptedException {
        LockDemo lock = new LockDemo();

        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("t1 抢占到锁");
                System.out.println(ClassLayout.parseInstance(lock).toPrintable());
            }
        });
        t1.start();
        //Thread.sleep(1000);
        synchronized (lock) {
            System.out.println("Main 抢占锁");
            System.out.println(ClassLayout.parseInstance(lock).toPrintable());

        }
    }
}
