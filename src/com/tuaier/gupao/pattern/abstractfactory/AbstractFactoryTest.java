package com.tuaier.gupao.pattern.abstractfactory;

import com.tuaier.gupao.pattern.common.ICourse;
import com.tuaier.gupao.pattern.common.INote;
import com.tuaier.gupao.pattern.common.IVideo;

/**
 * @author kangfw5
 * @since 2019-05-18
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        ICourseFactory factory = new JavaCourseFactory();
        ICourse javaCourse = factory.createCourse();
        INote javaNote = factory.createNote();
        IVideo javaVideo = factory.createVideo();
        javaCourse.record();
        javaNote.write();
        javaVideo.video();

        ICourseFactory pythonFactory = new PythonCourseFactory();
        ICourse pythonCourse = pythonFactory.createCourse();
        INote pythonNote = pythonFactory.createNote();
        IVideo pythodVideo = pythonFactory.createVideo();
        pythonCourse.record();
        pythonNote.write();
        pythodVideo.video();
    }
}
