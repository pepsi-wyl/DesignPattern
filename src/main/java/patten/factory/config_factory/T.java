package patten.factory.config_factory;

/**
 * @author by pepsi-wyl
 * @date 2022-04-30 14:21
 */

// 测试类
public class T {
    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.createCoffee("american");
        System.out.println(coffee.getName());
        Coffee latte = CoffeeFactory.createCoffee("latte");
        System.out.println(latte.getName());
    }
}
