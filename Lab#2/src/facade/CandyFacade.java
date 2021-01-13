package facade;

import domain.candy.Candy;
import decorator.AbstractFactoryDecorator;
import decorator.FlavourDecorator;
import factory.AbstractFactory;


public class CandyFacade {

    private final AbstractFactory candyFactory;

    public CandyFacade(AbstractFactory abstractFactory) {
        this.candyFactory = abstractFactory;
    }

    public Candy getCandy(String type, String customFlavour, String manufacturer) {
        AbstractFactoryDecorator customizer = new FlavourDecorator(candyFactory, customFlavour);
        Candy customCandy = customizer.sellCandy(type);
        customCandy.setManufacturer(manufacturer);
        return customCandy;
    }
}
