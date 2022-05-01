package patten.factory.config_factory;

/**
 * @author by pepsi-wyl
 * @date 2022-04-30 14:21
 */

public class T {
    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.createCoffee("american");
        System.out.println(coffee.getName());
    }
}
