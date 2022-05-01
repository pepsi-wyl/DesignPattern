package patten.factory.simple_factory;

/**
 * @author by pepsi-wyl
 * @date 2022-04-24 16:00
 */

public class T {
    public static void main(String[] args) {
        Coffee coffee = new CoffeeStore().orderCoffee("latte");
        System.out.println(coffee.getName());
    }
}
