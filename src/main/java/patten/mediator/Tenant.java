package patten.mediator;

/**
 * @author by pepsi-wyl
 * @date 2022-09-27 15:11
 */

// 具体同事角色类  租房者
public class Tenant extends Person {

    // 构造方法
    public Tenant(String name, Mediator message) {
        super(name, message);
    }

    // 联系中介
    @Override
    public void constant(String message) {
        mediator.constant(message, this);
    }

    // 获取租房信息
    @Override
    public void getMessage(String message) {
        System.out.println("租房者获取到的信息为:" + name + "信息为:" + message);
    }

}
