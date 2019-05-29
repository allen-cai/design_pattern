package net.cailun.design.creational.abstractfactory;

/**
 * @ClassName PythonFactory
 * @Description TODO
 * @Author allen
 * @Date: 2019/5/30
 * @Version 1.0
 */
public class PythonFactory implements CourceFactory {
    public Article getAritcle() {
        return new PythonArticle();
    }

    public Video getVideo() {
        return new PythonVideo();
    }
}
