package cn.designdemo.singleton;

import java.io.Serializable;

public class HungrySingleton implements Serializable {

    private final static HungrySingleton HUNGRY_SINGLETON;
    //private final static HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

    static {
        HUNGRY_SINGLETON = new HungrySingleton();
    }

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return HUNGRY_SINGLETON;
    }

    public Object readResolve(){
        return HUNGRY_SINGLETON;
    }

}
