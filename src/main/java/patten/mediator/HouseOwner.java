package patten.mediator;

/**
 * @author by pepsi-wyl
 * @date 2022-09-27 15:14
 */

// 具体同事角色类  房东
public class HouseOwner extends Person {

    // 构造方法
    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    // 联系中介
    @Override
    public void constant(String message) {
        mediator.constant(message, this);
    }

    // 获取租房信息
    @Override
    public void getMessage(String message) {
        System.out.println("房东获取到的信息为:" + name + "信息为:" + message);
    }

}
