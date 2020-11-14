package factory;

import domain.candy.Candy;

public interface AbstractFactory {
    Candy sellCandy(String type);
}
