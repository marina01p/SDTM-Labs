package decorator;

import domain.candy.Candy;
import factory.AbstractFactory;

public class AbstractFactoryDecorator implements AbstractFactory {

    protected AbstractFactory decorator;

    public AbstractFactoryDecorator(AbstractFactory abstractFactory){
        this.decorator = abstractFactory;
    }

    public Candy sellCandy(String type) {
        return decorator.sellCandy(type);
    }
}
