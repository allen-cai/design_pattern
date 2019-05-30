package net.cailun.design.creational.builder;

/**
 * @ClassName CourseBuilder
 * @Description TODO
 * @Author allen
 * @Date: 2019/5/31
 * @Version 1.0
 */
public abstract class CourseBuilder {

    private String courseName;
    private String coursePPT;
    private String courseVideo;
    private String courseArticle;
    //question Q & A
    private String courseQA;

    public abstract void buildCourseName(String courseName);
    public abstract void buildCoursePPT(String coursePPT);
    public abstract void buildCourseVideo(String courseVideo);
    public abstract void buildCourseArticle(String courseArticle);
    public abstract void buildCourseQA(String courseQA);

    public abstract Course makeCourse();
}
