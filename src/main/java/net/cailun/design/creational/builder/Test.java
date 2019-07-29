package net.cailun.design.creational.builder;

/**
 * @ClassName Test
 * @Description TODO
 * @Author allen
 * @Date: 2019/5/31
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);
        Course course = coach.makeCourse("java设计模式精讲",
                "java设计模式精讲PPT",
                "java设计模式精讲视频",
                "java设计模式精讲笔记",
                "java设计模式精讲问答");
    }
}
