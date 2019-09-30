package cn.designdemo.singleton;

/**
 * volatile关键字的作用：
 *     在多线程情况下，可以共享内存值，达到可见性，防止重排序
 */
public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton(){

    }

    public static LazyDoubleCheckSingleton getInstance(){
        if (lazyDoubleCheckSingleton == null){
            synchronized (LazySingleton.class){
                if (lazyDoubleCheckSingleton == null){
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    //期间会执行是三个操作：
                    //1.分配内存给对象
                    //2.初始化对象
                    //3.设置lazyDoubleCheckSingleton 指向刚刚分配的内存地址
                    // 2 3可以重排序（单线程下没问题，多线程就会问题）
                    //可以通过volatile关键字解决
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }

}
