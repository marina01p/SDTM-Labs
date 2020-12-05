package facade;

import decorator.AbstractFactoryDecorator;
import decorator.FlavourDecorator;
import domain.candy.Candy;
import factory.AbstractFactory;


public class CandyFacade {

    private final AbstractFactory candyFactory;

    public CandyFacade(AbstractFactory abstractFactory) {
        this.candyFactory = abstractFactory;
    }

    public Candy getCandy(String type, String customColor, String manufacturer) {
        AbstractFactoryDecorator customizer = new FlavourDecorator(candyFactory, customColor);
        Candy customCandy = customizer.sellCandy(type);
        customCandy.setManufacturer(manufacturer);
        return customCandy;
    }
}
