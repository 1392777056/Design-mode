package cn.designdemo.abstractfactory;

public class JavaCourseFactory implements CourseFactory {
    public Video getVideo() {
        return new JavaVideo();
    }

    public ShowJi getShowJi() {
        return new JavaShowJi();
    }
}
