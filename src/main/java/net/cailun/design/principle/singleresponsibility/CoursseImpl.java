package net.cailun.design.principle.singleresponsibility;

/**
 * 接口的单一职责原则
 * @ClassName ${className}
 * @Description TODO
 * @Author allen
 * @Date: ${Date}
 * @Version 1.0
 */
public class CoursseImpl implements ICourseContent, ICourseManage {

    /**
     * 将类型不同的接口分开，尽量不要拥挤的放到一个接口当中，如果需要使用的话，那么可以实现多个接口
     * 将方法进行组合，但是如果所有的接口方法都放到一起，那么就没有选择的余地。
     * 接口是稳定的约定，所以将接口的责任划分清楚非常的重要。
     * @return
     */

    public String getCourseName() {
        return null;
    }

    public byte[] getCourseVideo() {
        return new byte[0];
    }

    public void studyCourse() {

    }

    public void refundCourse() {

    }
}
