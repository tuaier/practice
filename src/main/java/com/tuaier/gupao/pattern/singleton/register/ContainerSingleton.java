package com.tuaier.gupao.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 容器式单例
 *
 * @author kangfw5
 * @since 2019-05-28
 */
public class ContainerSingleton {

    private static final Map<String, Object> IOC = new ConcurrentHashMap<>();

    private ContainerSingleton() {}

    public static Object getBean(String className) {
        if (!IOC.containsKey(className)) {
            synchronized (IOC) {
                if (!IOC.containsKey(className)) {
                    Object obj = null;
                    try {
                        obj = Class.forName(className).newInstance();
                        IOC.put(className, obj);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return obj;
                }
                return IOC.get(className);
            }
        } else {
            return IOC.get(className);
        }
    }
}
