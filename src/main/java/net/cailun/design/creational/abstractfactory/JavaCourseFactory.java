package net.cailun.design.creational.abstractfactory;

/**
 * @ClassName JavaCourseFactory
 * @Description TODO
 * @Author allen
 * @Date: 2019/5/30
 * @Version 1.0
 */
public class JavaCourseFactory implements CourceFactory {
    public Article getAritcle() {
        return new JavaArticle();
    }

    public Video getVideo() {
        return new JavaVideo();
    }
}
