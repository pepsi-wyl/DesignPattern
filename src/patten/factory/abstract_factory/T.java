package patten.factory.abstract_factory;

import patten.factory.abstract_factory.Dessert.Dessert;
import patten.factory.abstract_factory.coffee.Coffee;
import patten.factory.abstract_factory.factory.AmericanDessertFactory;
import patten.factory.abstract_factory.factory.ItalyDessertFactory;

/**
 * @author by pepsi-wyl
 * @date 2022-04-24 17:49
 */
public class T {
    public static void main(String[] args) {
//        ItalyDessertFactory factory = new ItalyDessertFactory();
        AmericanDessertFactory factory = new AmericanDessertFactory();
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();
        System.out.println(coffee.getName());
        System.out.println(dessert.getName());
    }
}
