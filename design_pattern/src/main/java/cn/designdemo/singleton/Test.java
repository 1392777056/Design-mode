package cn.designdemo.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        //LazySingleton lazySingleton = LazySingleton.getInstance();

        //枚举
        EnumSingleton instance = EnumSingleton.getInstance();
        instance.printTest();
        /*EnumSingleton instance = EnumSingleton.getInstance();

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("enumsingleton"));

        oos.writeObject(instance);

        File file = new File("enumsingleton");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        EnumSingleton newinstance = (EnumSingleton) ois.readObject();

        System.out.println(instance.getData());
        System.out.println(newinstance.getData());
        System.out.println(instance.getData() == newinstance.getData());*/

        //枚举  消除了序列化和反射的问题（单例建议这么写）===========================================
        /*Class objectClass = EnumSingleton.class;
        Constructor constructor = objectClass.getDeclaredConstructor(String.class,int.class);
        constructor.setAccessible(true);
        //EnumSingleton instance = EnumSingleton.getInstance();
        EnumSingleton newinstance = (EnumSingleton)constructor.newInstance("zhangsan",666);


        //System.out.println(instance);
        System.out.println(newinstance);
        //System.out.println(instance == newinstance);*/

        //反射   单例模式会出现的问题（静态内部类）   (懒汉式也存在同样的问题，就不演示了。暴力反射还会攻击)
        /*Class objectClass = StaticInncSingleton.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        StaticInncSingleton instance = StaticInncSingleton.getInstance();
        StaticInncSingleton newinstance = (StaticInncSingleton)constructor.newInstance();
        System.out.println(instance);
        System.out.println(newinstance);
        System.out.println(instance == newinstance);*/

        //反射   单例模式会出现的问题（饿汉式）
        /*Class objectClass = HungrySingleton.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        HungrySingleton instance = HungrySingleton.getInstance();
        HungrySingleton newinstance = (HungrySingleton)constructor.newInstance();
        System.out.println(instance);
        System.out.println(newinstance);
        System.out.println(instance == newinstance);*/


        //反序列化和序列化单例的破坏解决
       /* HungrySingleton instance = HungrySingleton.getInstance();

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("hungrysingleton"));

        oos.writeObject(instance);

        File file = new File("hungrysingleton");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        HungrySingleton newinstance = (HungrySingleton) ois.readObject();

        System.out.println(instance);
        System.out.println(newinstance);
        System.out.println(instance == newinstance);*/

        /*Thread t1 = new Thread(new Runnable() {
            public void run() {
                StaticInncSingleton staticInncSingleton = StaticInncSingleton.getInstance();
                System.out.println(Thread.currentThread().getName()+"--"+staticInncSingleton);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                StaticInncSingleton staticInncSingleton = StaticInncSingleton.getInstance();
                System.out.println(Thread.currentThread().getName()+"--"+staticInncSingleton);
            }
        });
        t1.start();
        t2.start();
        System.out.println("end ");*/

        /*Thread t1 = new Thread(new Runnable() {
            public void run() {
                LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();
                System.out.println(Thread.currentThread().getName()+"--"+lazyDoubleCheckSingleton);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();
                System.out.println(Thread.currentThread().getName()+"--"+lazyDoubleCheckSingleton);
            }
        });
        t1.start();
        t2.start();
        System.out.println("end ");*/


        /*Thread t1 = new Thread(new Runnable() {
            public void run() {
                LazySingleton lazySingleton = LazySingleton.getInstance();
                System.out.println(Thread.currentThread().getName()+"--"+lazySingleton);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                LazySingleton lazySingleton = LazySingleton.getInstance();
                System.out.println(Thread.currentThread().getName()+"--"+lazySingleton);
            }
        });
        t1.start();
        t2.start();
        System.out.println("end ");*/

    }

}
