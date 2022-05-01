package patten.factory.abstract_factory.factory;

import patten.factory.abstract_factory.coffee.Coffee;
import patten.factory.abstract_factory.Dessert.Dessert;

/**
 * @author by pepsi-wyl
 * @date 2022-04-24 17:42
 */

// 抽象工厂类
public interface DessertFactory {

    // 生产咖啡
    Coffee createCoffee();

    // 生产甜点类
    Dessert createDessert();

}
