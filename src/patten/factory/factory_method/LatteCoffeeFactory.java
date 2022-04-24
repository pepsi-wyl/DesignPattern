package patten.factory.factory_method;

/**
 * @author by pepsi-wyl
 * @date 2022-04-24 16:38
 */

// 拿铁咖啡工厂
public class LatteCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
