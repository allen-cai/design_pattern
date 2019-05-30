package net.cailun.design.principle.demeter;

/**
 * @ClassName ${className}
 * @Description TODO
 * @Author allen
 * @Date: ${Date}
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        /**
         * 一个类尽量少的对外公开
         * 也就是只与朋友交流（朋友：入参，返回值，内部成员变量）
         * 也就是说，方法的调用只关心结果，而不关系实现的细节，所以一些细节尽量不需要在调用方展示
         * 对外部的内知道的越少越好
         * 每个类对外部的类依赖的越少越好
         */
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}
