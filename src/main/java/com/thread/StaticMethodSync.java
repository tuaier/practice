package com.thread;

/**
 * @author kangfw5
 * @since 2020-07-31
 */
public class StaticMethodSync {
    public static void stMethod() {
        System.out.println("good enough" + Thread.currentThread().getId());
        while (true) {

        }
        /*try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }
}
