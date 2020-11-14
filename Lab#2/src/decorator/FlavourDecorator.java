package decorator;

import domain.candy.Candy;
import factory.AbstractFactory;


public class FlavourDecorator extends AbstractFactoryDecorator {

    private final String customFlavour;

    public FlavourDecorator(AbstractFactory abstractFactory, String customFlavour) {
        super(abstractFactory);
        this.customFlavour = customFlavour;
    }

    @Override
    public Candy sellCandy(String type) {
        Candy candy = super.sellCandy(type);
        candy.setFlavour(this.customFlavour);
        return candy;
    }

}
