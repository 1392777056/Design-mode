package cn.designdemo.singleton;

/**
 * 注： synchronized 如果写在静态方法上，就锁住了整个类
 *      synchronized 如果写在普通方法上，就锁住了整个对象
 *      synchronized 如果写在代码块上，就锁住了代码区域中
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton(){

    }

    public synchronized static LazySingleton getInstance(){
        if (lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

}
