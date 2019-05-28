package com.tuaier.gupao.pattern.singleton.lazy;

import com.tuaier.gupao.pattern.singleton.threadlocal.ThreadLocalSingleton;

/**
 * @author kangfw5
 * @since 2019-05-28
 */
public class ExectorThread implements Runnable {

    @Override
    public void run() {
        //LazyDoubleCheckSingleton lazySingleton = LazyDoubleCheckSingleton.getInstance();
        //LazySingleton lazySingleton = LazySingleton.getInstance();
        ThreadLocalSingleton singleton = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }
}
