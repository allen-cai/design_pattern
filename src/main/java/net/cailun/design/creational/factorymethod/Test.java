package net.cailun.design.creational.factorymethod;

/**
 * @ClassName ${className}
 * @Description TODO
 * @Author allen
 * @Date: ${Date}
 * @Version 1.0
 */
public class Test {
    /**
     * 优点：
     * 创建对象需要大量重复的代码
     * 客户端不依赖于产品类实例如何被创建，实现等细节
     * 一个类通过其子类来指定创建哪个对象
     * 缺点：
     * 类的个数容易过多，增加复杂度
     * 增加了系统的抽象性和理解难度
     *
     * 重要概念：
     * 产品族：打个比方，美的的空调，美的的冰箱属于同一产品族
     * 产品等级：美的的空调，海尔的空调属于同一产品等级
     *
     * @param args
     */
    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }
}
