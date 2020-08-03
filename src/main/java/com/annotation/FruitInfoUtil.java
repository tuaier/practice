package com.annotation;

import java.lang.reflect.Field;

/**
 * @author kangfw5
 * @since 2020-06-27
 */
public class FruitInfoUtil {
    public static void getFruitInfo(Class<?> clazz) {
        StringBuilder strFruitProvider = new StringBuilder("供应商信息：\n");
        //通过反射获取处理注解
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(FruitProvider.class)) {
                FruitProvider fruitProvider = field.getAnnotation(FruitProvider.class);
                //注解信息的处理地方
                strFruitProvider.append("供应商编号：").append(fruitProvider.id()).append(" 供应商名称：").append(fruitProvider.name())
                        .append(" 供应商地址：").append(fruitProvider.address()).append("\n");
            }
        }
        System.out.println(strFruitProvider);
    }
}
