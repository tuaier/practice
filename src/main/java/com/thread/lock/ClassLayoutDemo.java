package com.thread.lock;

import org.openjdk.jol.info.ClassLayout;

/**
 * @author kangfw5
 * @since 2020-08-03
 */
public class ClassLayoutDemo {

    public static void main(String[] args) {
        ClassLayoutDemo classLayoutDemo = new ClassLayoutDemo();
        synchronized (classLayoutDemo) {
            System.out.println("locking");
            // 开启偏向锁 -XX:+UseBiasedLocking -XX:BiasedLockingStartupDelay=0
            System.out.println(ClassLayout.parseInstance(classLayoutDemo).toPrintable());
        }
    }
}
