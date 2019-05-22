package net.cailun.design.principle.singleresponsibility;

/**
 * @ClassName ${className}
 * @Description TODO
 * @Author allen
 * @Date: ${Date}
 * @Version 1.0
 */
public class Test {
    /**
     * 类遵循单一职责原则
     * 将不同功能的类划分开，在后期维护的时候会更加的遍历，代码修改的时候不太会影响到别人的功能
     * 缺点：类爆炸（也就是说，如果所有的小功能点都建单独的类的话，会出现很多很多的类，所以类的单一职责原则视情况而定）
     * @param args
     */
    public static void main(String[] args) {
        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");

        MoveBird moveBird = new MoveBird();
        moveBird.mainMoveMode("企鹅");
    }
}
