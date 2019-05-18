package com.tuaier.gupao.pattern.simplefactory;

import com.tuaier.gupao.pattern.common.ICourse;
import com.tuaier.gupao.pattern.common.JavaCourse;

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
