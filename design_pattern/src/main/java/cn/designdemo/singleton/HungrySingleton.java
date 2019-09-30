package cn.designdemo.singleton;

public class HungrySingleton {

    private final static HungrySingleton HUNGRY_SINGLETON;
    //private final static HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

    static {
        HUNGRY_SINGLETON = new HungrySingleton();
    }

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return HUNGRY_SINGLETON;
    }

}
