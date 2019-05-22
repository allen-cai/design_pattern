package net.cailun.design.principle.singleresponsibility;

/**
 *  * 方法遵循单一职责原则
 * @ClassName ${className}
 * @Description TODO
 * @Author allen
 * @Date: ${Date}
 * @Version 1.0
 */
public class Method {
    /**
     * 修改信息
     * @param userName
     * @param address
     */
    private void updateUserInfo(String userName, String address) {
        userName = "allen";
        address = "zhuhai";
    }
    /**
     * 像这种总情况的话，就是说让一个方法做了两份事情，那么这种情况就可以使用单一职责原则将两个方法拆分成下面两个方法
     */
    public void updateUserName(String username) {
        username = username;
    }
    public void updateUserAddress(String address) {
        address = address;
    }

    /**
     * 上面的情况只是简单的描述了单一职责原则，尽量将方法细化到单一的职责，那么方法名的话也就很容易分辨且有意义
     */
}
