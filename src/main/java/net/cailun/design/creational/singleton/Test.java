package net.cailun.design.creational.singleton;

/**
 * @ClassName Test
 * @Description TODO
 * @Author allen
 * @Date: 2019/6/4
 * @Version 1.0
 */
public class Test {
    /**
     * 懒汉单利模式：
     *      v1：
     *          在单线程任务中适用，但是不适用于多线程
     *      v2：
     *          存在情况多个线程都会new一个新的对象
     * 双重确认单利模式：
     *      v1：
     *          存在创建对象的重排序问题，也就是说，当一个线程创建对象的时候发生了重排序，变量获得了内存但是并未初始化，cpu就切
     *          到另外一个线程上去执行，判断对象是否为空的时候，得出的结果是非空，那么就直接返回继续执行。那么程序就会报错。
     *      v2：
     *          （解决对象创建重排序问题：当一个程序在创建的时候，将其他线程挂起）通过关键字volatile解决多线程创建对象的重排序问题。
     *
     * @param args
     */
    public static void main(String[] args) {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
        LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();
        Thread t1 = new Thread(new Tthread());
        Thread t2 = new Thread(new Tthread());
        t1.start();
        t2.start();
        System.out.println("program end");
    }
}
