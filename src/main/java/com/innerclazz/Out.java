package com.innerclazz;

/**
 * @author kangfw5
 * @since 2020-06-27
 */
public class Out {

    /*// 静态内部类
    private static int a;
    private int b;

    public static class Inner {
        public void print() {
            System.out.println(a);
        }
    }*/
    private static int a;
    private int b;

    public class Inner {
        public void print() {
            System.out.println(a);
            System.out.println(b);
        }
    }
}