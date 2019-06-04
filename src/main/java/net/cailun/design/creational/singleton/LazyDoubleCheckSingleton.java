package net.cailun.design.creational.singleton;

/**
 * @ClassName LazyDoubleCheckSingleton
 * @Description TODO
 * @Author allen
 * @Date: 2019/6/4
 * @Version 1.0
 */
public class LazyDoubleCheckSingleton {

    /**
     * v1
     */
//    private static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    /**
     * v2
     * 解决了对象重排序问题
     */
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    public LazyDoubleCheckSingleton() {
    }

    public synchronized static LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    /**
                     * 创建对象的三个步骤
                     * 1:分配内存给这个对象
                     * 2：初始化对象
                     * 3：设置lazyDoubleCheckSingleton 指向刚分配的内存
                     * 注意--2和3的顺序可能会倒过来
                     *
                     */
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
