package facade;

import domain.candy.Candy;
import decorator.AbstractFactoryDecorator;
import decorator.FlavourDecorator;
import factory.AbstractFactory;


public class CandyFacade {

    private final AbstractFactory furnitureFactory;

    public CandyFacade(AbstractFactory furnitureFactory) {
        this.furnitureFactory = furnitureFactory;
    }

    public Candy getCustomFurniture(String type, String customColor, String manufacturer) {
        AbstractFactoryDecorator customizer = new FlavourDecorator(furnitureFactory, customColor);
        Candy customCandy = customizer.sellCandy(type);
        customCandy.setManufacturer(manufacturer);
        return customCandy;
    }
}
