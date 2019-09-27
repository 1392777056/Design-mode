package cn.designdemo.abstractfactory;

public class PythonCourseFactory implements CourseFactory {
    public Video getVideo() {
        return new PythonVideo();
    }

    public ShowJi getShowJi() {
        return new PythonShowJi();
    }
}
