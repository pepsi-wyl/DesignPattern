package patten.factory.simple_factory;

/**
 * @author by pepsi-wyl
 * @date 2022-04-24 15:53
 */

/**
 * 咖啡工厂
 */

public class SimpleCoffeeFactory {

    // 生产咖啡方法
    public Coffee createCoffee(String type) {
        // 咖啡对象
        Coffee coffee = null;
        switch (type) {
            case "american":
                coffee = new AmericanCoffee();
                break;
            case "latte":
                coffee = new LatteCoffee();
                break;
            default:
                throw new RuntimeException("类型错误");
        }
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
