package cn.designdemo.singleton;

import java.io.*;

public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //LazySingleton lazySingleton = LazySingleton.getInstance();

        //反序列化和序列化单例的破坏解决
        HungrySingleton instance = HungrySingleton.getInstance();

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("hungrysingleton"));

        oos.writeObject(instance);

        File file = new File("hungrysingleton");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        HungrySingleton newinstance = (HungrySingleton) ois.readObject();

        System.out.println(instance);
        System.out.println(newinstance);
        System.out.println(instance == newinstance);

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
