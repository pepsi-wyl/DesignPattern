package patten.factory.simple_factory;

/**
 * @author by pepsi-wyl
 * @date 2022-04-24 15:53
 */

public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        Coffee coffee = new SimpleCoffeeFactory().createCoffee(type);
        return coffee;
    }
}
