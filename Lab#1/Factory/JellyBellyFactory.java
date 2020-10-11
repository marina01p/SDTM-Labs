package Creational_Design_Patterns.Factory;

import Creational_Design_Patterns.Candy.Builder.*;
import Creational_Design_Patterns.Candy.Candy;
import Creational_Design_Patterns.CandySeller;

import java.util.ArrayList;

public class JellyBellyFactory implements Creational_Design_Patterns.Factory.AbstractFactory {

    private static volatile JellyBellyFactory jellyBellyFactory;
    private CandySeller director = new CandySeller();

    public static JellyBellyFactory getJellyBellyFactory() {
        if (jellyBellyFactory == null)
            jellyBellyFactory = new JellyBellyFactory();
        return jellyBellyFactory;
    }

    private JellyBellyFactory() {
    }

    @Override
    public Candy sellCandy(String product) {
        switch (product) {
            case "sour jelly":
                SourJellyBuilder sourJellyBuilder = new SourJellyBuilder();
                director.makeJellyBellySourJelly(sourJellyBuilder);
                return sourJellyBuilder.getProduct();
            case "jelly beans":
                JellyBeansBuilder jellyBeansBuilder = new JellyBeansBuilder();
                director.makeJellyBellyJellyBeans(jellyBeansBuilder);
                return jellyBeansBuilder.getProduct();
            case "lollipop":
                LollipopBuilder lollipopBuilder = new LollipopBuilder();
                director.makeJellyBellyLollipop(lollipopBuilder);
                return lollipopBuilder.getProduct();
            case "mint":
                MintBuilder mintBuilder = new MintBuilder();
                director.makeJellyBellyMint(mintBuilder);
                return mintBuilder.getProduct();
            default:
                return null;
        }

    }
}
