package cn.designdemo.prototype;

public class Person implements Cloneable {

    PersonalInfo personalInfo;

    public Person(String name,String age,String address){
        this.personalInfo = new PersonalInfo(name,age,address);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person person = (Person) super.clone();
        person.personalInfo = (PersonalInfo) this.personalInfo.clone();
        return person;
    }
}
