package com.tuaier.gupao.pattern.singleton;

import com.tuaier.gupao.pattern.singleton.register.ContainerSingleton;

public class ExectorThread implements Runnable{

    @Override
    public void run() {
        Object instance = ContainerSingleton.getBean("com.tuaier.gupao.pattern.singleton.register.TestVO");
        System.out.println(instance);
        System.out.println(Thread.currentThread().getName() + ":" + instance);
    }
}
