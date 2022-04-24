package patten.factory.simple;

/**
 * @author by pepsi-wyl
 * @date 2022-04-24 15:53
 */

public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        SimpleCoffeeFactory simpleCoffeeFactory = new SimpleCoffeeFactory();
        Coffee coffee = simpleCoffeeFactory.createCoffee(type);
        return coffee;
    }
}
