package com.tuaier.gupao.pattern.singleton.register;

import com.tuaier.gupao.pattern.singleton.ExectorThread;

public class ContainerSingletonTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        System.out.println("End");
    }
}
