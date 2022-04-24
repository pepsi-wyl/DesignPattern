package patten.factory.factory_method;

/**
 * @author by pepsi-wyl
 * @date 2022-04-24 15:40
 */

/**
 * 咖啡类 抽象类
 */

public abstract class Coffee {

    // 抽象方法
    public abstract String getName();

    // 加糖
    public void addSugar() {
        System.out.println("加糖");
    }

    // 加牛奶
    public void addMilk() {
        System.out.println("加牛奶");
    }

}
