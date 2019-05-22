package net.cailun.design.principle.openclose;

/**
 * @ClassName ${className}
 * @Description TODO
 * @Author allen
 * @Date: ${Date}
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        ICourse course = new JavaDiscountCourse(96,"java从零到企业级电商开发", 348d);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse) course;
        System.out.println("课程id" + javaCourse.getId() + "课程名称：" + javaCourse.getName()+ "课程原价：" + javaCourse.getOriginPrice() + "课程价格：" + javaCourse.getPrice() + "元");
    }
}
