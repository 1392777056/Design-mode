package cn.designdemo.abstractfactory;

public class Test {

    public static void main(String[] args) {

       // CourseFactory factory = new JavaCourseFactory();
        CourseFactory factory = new PythonCourseFactory();
        Video video = factory.getVideo();
        ShowJi showJi = factory.getShowJi();
        video.getVideo();
        showJi.getShouJi();

    }

}
