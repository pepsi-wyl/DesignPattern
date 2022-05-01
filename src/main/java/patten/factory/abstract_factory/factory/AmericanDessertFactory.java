package patten.factory.abstract_factory.factory;

import patten.factory.abstract_factory.coffee.AmericanCoffee;
import patten.factory.abstract_factory.coffee.Coffee;
import patten.factory.abstract_factory.Dessert.Dessert;
import patten.factory.abstract_factory.Dessert.MatchMousse;

/**
 * @author by pepsi-wyl
 * @date 2022-04-24 17:44
 */

// 美式风味
public class AmericanDessertFactory implements DessertFactory {

    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchMousse();
    }

}
