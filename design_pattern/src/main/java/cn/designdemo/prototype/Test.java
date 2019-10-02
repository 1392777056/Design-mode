package cn.designdemo.prototype;

/**
 * 这是因为java中不仅仅有基本变量，还有引用变量
 * 浅拷贝：仅仅克隆基本类型变量，而不克隆引用类型的变量
 * 深克隆：既克隆基本类型变量，也克隆引用类型变量
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {

        Person p = new Person("啊啊啊", "55", "123");
        Person p1 = (Person)p.clone();
        System.out.println(p == p1);
        System.out.println(p.personalInfo == p1.personalInfo);
        System.out.println(p.personalInfo.name == p1.personalInfo.name);

        System.out.println(p.personalInfo.name);
        System.out.println(p1.personalInfo.name);



    }

}
