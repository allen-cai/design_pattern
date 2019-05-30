package net.cailun.design.creational.abstractfactory;

/**
 * @ClassName PythonVideo
 * @Description TODO
 * @Author allen
 * @Date: 2019/5/30
 * @Version 1.0
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("python视频");
    }
}
