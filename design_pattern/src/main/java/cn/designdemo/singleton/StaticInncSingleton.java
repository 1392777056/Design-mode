package cn.designdemo.singleton;

/**
 * 静态内部类解决的是：防止其他线程看到 某个线程在初始化对象的重排序  隐藏
 */
public class StaticInncSingleton {

    private static class InnerClass{
        private static StaticInncSingleton staticInncSingleton = new StaticInncSingleton();
    }

    private StaticInncSingleton(){
        if (InnerClass.staticInncSingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static StaticInncSingleton getInstance(){
        return InnerClass.staticInncSingleton;
    }



}
