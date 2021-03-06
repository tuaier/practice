package com.tuaier.gupao.pattern.factory.simplefactory;

import com.tuaier.gupao.pattern.factory.common.ICourse;
import com.tuaier.gupao.pattern.factory.common.JavaCourse;

/**
 * 简单工厂测试类
 *
 * @author kangfw5
 * @since 2019-05-17
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        CourseFactory courseFactory = new CourseFactory();
        ICourse course = courseFactory.create(JavaCourse.class);
        course.record();
    }
}
