package net.cailun.design.principle.interfacesegregation;

/**
 * @ClassName ${className}
 * @Description TODO
 * @Author allen
 * @Date: ${Date}
 * @Version 1.0
 */
public class Dog implements IEatAnimalAction, ISwimAction{
    /**
     * 接口隔离原则和单一职责原则的区别
     * 单一职责原则所侧重的是类，方法，接口的职责，也就是说只要职责想类似，那么就可以放到一起。
     * 而接口隔离原则所侧重的是将接口的粒度变低，让接口的耦合度变低。
     */
    public void eat() {

    }

    public void swim() {

    }
}
