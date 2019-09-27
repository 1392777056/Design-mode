package cn.designdemo.builder;

public class Test {

    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("java课程","java的PPT","java的Video",
                "java的手记","java的问答");

        System.out.println(course);
    }

}
