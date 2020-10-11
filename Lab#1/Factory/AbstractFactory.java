package Creational_Design_Patterns.Factory;

import Creational_Design_Patterns.Candy.Candy;

public interface AbstractFactory {
    Candy sellCandy(String name);
}
