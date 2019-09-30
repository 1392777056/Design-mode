package cn.designdemo.singleton;

public class Test {

    public static void main(String[] args) {

        //LazySingleton lazySingleton = LazySingleton.getInstance();

        Thread t1 = new Thread(new Runnable() {
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
        System.out.println("end ");

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
