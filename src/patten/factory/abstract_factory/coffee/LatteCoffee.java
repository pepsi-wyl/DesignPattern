package patten.factory.abstract_factory.coffee;

import patten.factory.abstract_factory.coffee.Coffee;

/**
 * @author by pepsi-wyl
 * @date 2022-04-24 15:51
 */

public class LatteCoffee extends Coffee {
    @Override
    public String getName() {
        return "拿铁咖啡";
    }
}
