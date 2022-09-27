package patten.mediator;

/**
 * @author by pepsi-wyl
 * @date 2022-09-27 15:09
 */

// 抽象同事类
public abstract class Person {

    protected String name;        // name属性
    protected Mediator mediator;  // 中介类

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    // 联系中介
    public abstract void constant(String message);

    // 获取租房信息
    public abstract void getMessage(String message);
}
