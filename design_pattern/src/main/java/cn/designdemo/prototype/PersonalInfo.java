package cn.designdemo.prototype;

import org.springframework.beans.BeanUtils;

public class PersonalInfo implements Cloneable {

    String name;

    String age;

    String address;

    public PersonalInfo(String name, String age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        PersonalInfo personalInfo = (PersonalInfo) super.clone();
        //BeanUtils.copyProperties(personalInfo,new PersonalInfo(this.name,this.age,this.address));
        personalInfo.name = new String(this.name);
        personalInfo.age = new String(this.age);
        personalInfo.address = new String(this.address);
        return personalInfo;
    }
}
