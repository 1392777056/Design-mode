package cn.designdemo.builder.v2;

public class Test {

    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("张三").buildCoursePPT("PPPT").builder();
        System.out.println(course);
    }

}
