package net.cailun.design.creational.factorymethod;

/**
 * @ClassName ${className}
 * @Description TODO
 * @Author allen
 * @Date: ${Date}
 * @Version 1.0
 */
public class JavaVideoFactory extends VideoFactory {
    public Video getVideo() {
        return new JavaVedio();
    }
}
