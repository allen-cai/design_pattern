package net.cailun.design.creational.simplefactory;

/**
 * @ClassName ${className}
 * @Description TODO
 * @Author allen
 * @Date: ${Date}
 * @Version 1.0
 */
public class VideoFactory {
    /**
     * V.1
     * 简单工厂的缺点：
     * 随着工厂方法的扩展，需要不停的修改工厂方法
     * 违背了开闭原则
     * @param type
     * @return
     */
//    public Video getVideo(String type) {
//        if ("java".equalsIgnoreCase(type)) {
//            return new JavaVedio();
//        } else if ("python".equalsIgnoreCase(type)) {
//            return new PythonVedio();
//        }
//        return null;
//    }

    public Video getVideo(Class c) {
        Video video = null;

        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
