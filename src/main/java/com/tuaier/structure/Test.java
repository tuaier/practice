package com.tuaier.structure;

/**
 * @author kangfw5
 * @since 2020-03-21
 */
public class Test {
    private static int x = 0,y=0,a=0,b=0;
    public static void main(String[] args) throws InterruptedException {
        for (int i=0;;i++) {
            x=0;
            y=0;
            a=0;
            b=0;
            Thread thread1 = new Thread(()->{
                a=1;
                x=b;
            }, "thread1");
            Thread thread2 = new Thread(()->{
                b=1;
                y=a;
            }, "thread2");
            thread1.start();
            thread2.start();
            thread1.join();
            thread2.join();
            if (x==0 && y==0) {
                System.out.println(i);
                break;
            }
        }
    }
}
