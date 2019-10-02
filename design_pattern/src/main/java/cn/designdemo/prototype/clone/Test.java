package cn.designdemo.prototype.clone;

import java.util.Date;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {

        Date birthday = new Date(0L);
        Pig pig = new Pig("小猪1", birthday);
        Pig pig1 = (Pig) pig.clone();

      /*  Pig222 pig = new Pig222("小猪1", "1232");
        Pig222 pig1 = (Pig222) pig.clone();*/

        System.out.println(pig);
        System.out.println(pig1);

        //System.out.println(pig == pig1);
        pig.getBirthday().setTime(555555L);
       /* String birthday = pig.getBirthday();
        pig.setBirthday("111111");*/
        System.out.println(pig);
        System.out.println(pig1);
    }

}
