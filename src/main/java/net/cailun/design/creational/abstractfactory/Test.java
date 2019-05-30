package net.cailun.design.creational.abstractfactory;

/**
 * @ClassName Test
 * @Description TODO
 * @Author allen
 * @Date: 2019/5/30
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        /**
         * 抽象工厂面对的是产品族，工厂方法面对的产品类
         * 抽象工厂面对的是稳定的产品族，如果产品族不稳定，需要经常更改，那么抽象工厂是不适用的
         * 优点：
         *     具体产品在应用层代码隔离，无须关系创建细节
         *     将一个系列的产品族统一到一起创建
         * 缺点：
         *     规定了所有可能被创建的产品集合，产品族中扩展新的产品困难，需要修改抽象工厂的接口(违背开闭原则)
         *     增加了系统的抽象性和理解难度
         */
        CourceFactory courceFactory = new JavaCourseFactory();
        Video video = courceFactory.getVideo();
        Article article = courceFactory.getAritcle();
        video.produce();
        article.getProduce();
    }
}
