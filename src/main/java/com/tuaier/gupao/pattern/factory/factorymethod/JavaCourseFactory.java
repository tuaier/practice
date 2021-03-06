package com.tuaier.gupao.pattern.factory.factorymethod;

import com.tuaier.gupao.pattern.factory.common.ICourse;
import com.tuaier.gupao.pattern.factory.common.JavaCourse;

/**
 * @author kangfw5
 * @since 2019-05-18
 */
public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
