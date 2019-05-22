package net.cailun.design.principle.openclose;

/**
 * @ClassName ${className}
 * @Description TODO
 * @Author allen
 * @Date: ${Date}
 * @Version 1.0
 */
public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice() {
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }
}
