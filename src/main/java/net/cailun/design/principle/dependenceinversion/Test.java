package net.cailun.design.principle.dependenceinversion;

/**
 * @ClassName ${className}
 * @Description TODO
 * @Author allen
 * @Date: ${Date}
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        Gelly gelly = new Gelly();
        gelly.studyCourse(new JavaCourse());
        gelly.studyCourse(new FECourse());
    }
}
