package utilities.factory;

import domain.Candy;

public interface AbstractFactory {
    Candy sellCandy(String name);
}
