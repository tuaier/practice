package com.tuaier.gupao.pattern.singleton.threadlocal;

/**
 * @author kangfw5
 * @since 2019-05-28
 */
public class ThreadLocalSingleton {

    private ThreadLocalSingleton() {

    }

    private static final ThreadLocal<ThreadLocalSingleton> THREAD_LOCAL = new ThreadLocal<ThreadLocalSingleton>() {
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    public static ThreadLocalSingleton getInstance() {
        return THREAD_LOCAL.get();
    }
}
