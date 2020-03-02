package com.tuaier.gupao.pattern.factory.factorymethod;

import com.tuaier.gupao.pattern.factory.common.ICourse;
import com.tuaier.gupao.pattern.factory.common.PythonCourse;

/**
 * @author kangfw5
 * @since 2019-05-18
 */
public class PythonCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
