package decorator;

import domain.candy.Candy;
import factory.AbstractFactory;

public class AbstractFactoryDecorator implements AbstractFactory {

    protected AbstractFactory wrapper;

    public AbstractFactoryDecorator(AbstractFactory abstractFactory){
        this.wrapper = abstractFactory;
    }

    public Candy sellCandy(String type) {
        return wrapper.sellCandy(type);
    }
}
