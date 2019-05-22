package net.cailun.design.principle.dependenceinversion;

/**
 * @ClassName ${className}
 * @Description TODO
 * @Author allen
 * @Date: ${Date}
 * @Version 1.0
 */
public class Gelly {

    private ICourse iCourse;

    public ICourse getiCourse() {
        return iCourse;
    }

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public Gelly(ICourse iCourse) {
        this.iCourse = iCourse;

    }

    public void studyCourse(ICourse iCourse) {
        iCourse.studyCourse();
    }
}
