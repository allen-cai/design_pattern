package net.cailun.design.creational.singleton;

/**
 * @ClassName Tthread
 * @Description TODO
 * @Author allen
 * @Date: 2019/6/4
 * @Version 1.0
 */
public class Tthread implements Runnable {
    public void run() {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
        LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + "  " + lazyDoubleCheckSingleton);
    }
}
