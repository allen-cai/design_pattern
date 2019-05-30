package net.cailun.design.creational.simplefactory;

/**
 * @ClassName ${className}
 * @Description TODO
 * @Author allen
 * @Date: ${Date}
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        //V.1
//        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("java");
//        if (video == null) {
//            return;
//        }
//        video.produce();

        /**
         * V.2
         * 利用反射，更加的最遵守开闭原则
         * 也提高了程序的可扩展性
         */
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVedio.class);
        video.produce();
    }
}
