package com.tuaier.gupao.pattern.abstractfactory;

import com.tuaier.gupao.pattern.common.ICourse;
import com.tuaier.gupao.pattern.common.INote;
import com.tuaier.gupao.pattern.common.IVideo;

/**
 * 所有的子工厂都实现该工厂
 * （一个品牌的抽象）
 *
 * @author kangfw5
 * @since 2019-05-18
 */
public interface ICourseFactory {
    ICourse createCourse();

    INote createNote();

    IVideo createVideo();
}
