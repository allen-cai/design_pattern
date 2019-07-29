package net.cailun.design.creational.singleton;

/**
 * @ClassName LazySingleton
 * @Description TODO
 * @Author allen
 * @Date: 2019/6/4
 * @Version 1.0
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    public LazySingleton() {
    }

    /**
     * v1
     * @return
     */
//    public static LazySingleton getInstance() {
//        if (lazySingleton == null) {
//            lazySingleton = new LazySingleton();
//        }
//         return lazySingleton;
//    }

    /**
     * v2
     * @return
     */
    public synchronized static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
