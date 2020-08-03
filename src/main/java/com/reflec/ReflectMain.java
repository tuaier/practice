package com.reflec;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author kangfw5
 * @since 2020-06-27
 */
public class ReflectMain {

    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName(Person.class.getName());
            System.out.println("构造方法：");
            Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
            //Constructor<?>[] declaredConstructors = clazz.getConstructors();
            for (Constructor<?> declaredConstructor : declaredConstructors) {
                if (declaredConstructor.getParameterCount() == 0) {
                    declaredConstructor.setAccessible(true);
                    Object o = declaredConstructor.newInstance();
                    System.out.println(o);
                }
                System.out.println(declaredConstructor);
            }
            System.out.println("方法：");
            Method[] declaredMethods = clazz.getDeclaredMethods();
            for (Method declaredMethod : declaredMethods) {
                System.out.println(declaredMethod);
            }
            System.out.println("成员变量：");
            Field[] declaredFields = clazz.getDeclaredFields();
            for (Field declaredField : declaredFields) {
                System.out.println(declaredField);
            }

            Person person = (Person) clazz.newInstance();
            System.out.println(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
