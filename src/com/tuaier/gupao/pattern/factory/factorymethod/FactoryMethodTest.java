package com.tuaier.gupao.pattern.factory.factorymethod;

import com.tuaier.gupao.pattern.common.ICourse;

/**
 * @author kangfw5
 * @since 2019-05-18
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        ICourseFactory factory = new PythonCourseFactory();
        ICourse course = factory.create();
        course.record();
    }
}
