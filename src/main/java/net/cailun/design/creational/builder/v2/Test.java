package net.cailun.design.creational.builder.v2;

/**
 * @ClassName Test
 * @Description TODO
 * @Author allen
 * @Date: 2019/5/31
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("java设计模式精讲").buildCourseArticle("java设计模式精讲笔记")
                .buildCoursePPT("java设计模式精讲PPT").build();
        System.out.println(course);
    }
}
