package com.tuaier.gupao.pattern.factory.simplefactory;

import com.tuaier.gupao.pattern.factory.common.ICourse;

/**
 * 工厂类
 *
 * @author kangfw5
 * @since 2019-05-17
 */
public class CourseFactory {
    public ICourse create(Class clazz) {
        try {
            if (clazz != null) {
                return (ICourse) clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
