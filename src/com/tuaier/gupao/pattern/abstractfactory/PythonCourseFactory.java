package com.tuaier.gupao.pattern.abstractfactory;

import com.tuaier.gupao.pattern.common.*;

/**
 * @author kangfw5
 * @since 2019-05-18
 */
public class PythonCourseFactory implements ICourseFactory {
    @Override
    public ICourse createCourse() {
        return new PythonCourse();
    }

    @Override
    public INote createNote() {
        return new PythonNote();
    }

    @Override
    public IVideo createVideo() {
        return new PythonVideo();
    }
}
