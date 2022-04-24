package patten.factory.factory_method;

/**
 * @author by pepsi-wyl
 * @date 2022-04-24 16:43
 */

public class T {
    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();
        store.setCoffeeFactory(new AmericanCoffeeFactory());
        Coffee coffee = store.orderCoffee();
        System.out.println(coffee.getName());
    }
}
