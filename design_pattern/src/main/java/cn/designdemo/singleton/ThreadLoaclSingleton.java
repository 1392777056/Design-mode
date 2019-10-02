package cn.designdemo.singleton;

public class ThreadLoaclSingleton {

    private static ThreadLocal<ThreadLoaclSingleton> threadLoaclSingleton
            = new ThreadLocal<ThreadLoaclSingleton>(){
        @Override
        protected ThreadLoaclSingleton initialValue() {
            return new ThreadLoaclSingleton();
        }
    };

    private ThreadLoaclSingleton(){}


    public static ThreadLoaclSingleton getInstance(){
        return threadLoaclSingleton.get();
    }
}
