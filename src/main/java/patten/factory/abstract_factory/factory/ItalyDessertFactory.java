package patten.factory.abstract_factory.factory;

import patten.factory.abstract_factory.coffee.Coffee;
import patten.factory.abstract_factory.Dessert.Dessert;
import patten.factory.abstract_factory.coffee.LatteCoffee;
import patten.factory.abstract_factory.Dessert.Trimisu;

/**
 * @author by pepsi-wyl
 * @date 2022-04-24 17:46
 */

// 意大利风味甜点工厂
public class ItalyDessertFactory implements DessertFactory {
    // 拿铁咖啡
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    // 提拉米苏
    @Override
    public Dessert createDessert() {
        return new Trimisu();
    }
}
