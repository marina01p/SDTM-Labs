package utilities.factory;

import domain.candy.Candy;

public interface AbstractFactory {
    Candy sellCandy(String name);
}
