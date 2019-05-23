package net.cailun.design.principle.interfacesegregation;

/**
 * @ClassName ${className}
 * @Description TODO
 * @Author allen
 * @Date: ${Date}
 * @Version 1.0
 */
public class Bird implements IFlyAnimalAction, IEatAnimalAction {
    /**
     * 接口隔离原则
     * 也就是说接口里的方法，所针对的事物不相同的话
     * 尽量将接口拆分开来分成几个接口，那么方法在实现接口的时候也就可以选择性的实现自己所需要的方法。
     * 接口隔离原则也不是隔离的越细越好，粗粒度不容易解耦，细粒度会使项目变得异常的庞大和复杂
     * 所以接口隔离原则一定要适量，也就是多花时间去设计接口，划分好接口
     */
    public void eat() {

    }

    public void fly() {

    }
}
