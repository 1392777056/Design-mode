package cn.designdemo.singleton;

import java.io.Serializable;

public class HungrySingleton implements Serializable {

    private final static HungrySingleton HUNGRY_SINGLETON;
    //private final static HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

    static {
        HUNGRY_SINGLETON = new HungrySingleton();
    }

    private HungrySingleton(){
        if (HUNGRY_SINGLETON != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static HungrySingleton getInstance(){
        return HUNGRY_SINGLETON;
    }

    public Object readResolve(){
        return HUNGRY_SINGLETON;
    }

}
