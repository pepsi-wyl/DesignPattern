package patten.factory.factory_method;

/**
 * @author by pepsi-wyl
 * @date 2022-04-24 16:35
 */

public class CoffeeStore {

    private CoffeeFactory coffeeFactory;

    public void setCoffeeFactory(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    // 点咖啡
    public Coffee orderCoffee() {
        Coffee coffee = coffeeFactory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

}
