package patten.factory.factory_method;

/**
 * @author by pepsi-wyl
 * @date 2022-04-24 16:35
 */

// 咖啡店
public class CoffeeStore {

    // 咖啡工厂对象
    private CoffeeFactory coffeeFactory;

    // 设置咖啡工厂对象
    public void setCoffeeFactory(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    // 点咖啡功能
    public Coffee orderCoffee() {
        Coffee coffee = coffeeFactory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

}
