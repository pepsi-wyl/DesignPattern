package patten.factory.factory_method;

/**
 * @author by pepsi-wyl
 * @date 2022-04-24 16:38
 */

// 美式咖啡工厂
public class AmericanCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
