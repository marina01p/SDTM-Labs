package Creational_Design_Patterns.Factory;

import Creational_Design_Patterns.Builder.*;
import Creational_Design_Patterns.Candy.Candy;
import Creational_Design_Patterns.CandySeller;

public class JellyBellyFactory implements Creational_Design_Patterns.Factory.AbstractFactory {

    private static JellyBellyFactory jellyBellyFactory;
    private CandySeller candySeller = new CandySeller();

    public static JellyBellyFactory getJellyBellyInstance() {
        if (jellyBellyFactory == null)
            jellyBellyFactory = new JellyBellyFactory();
        return jellyBellyFactory;
    }

    private JellyBellyFactory() {
    }

    @Override
    public Candy sellCandy(String product) {
        if (product.equals("sour jelly")) {
            SourJellyBuilder sourJellyBuilder = new SourJellyBuilder();
            candySeller.makeJellyBellySourJelly(sourJellyBuilder);
            return sourJellyBuilder.getProduct();
        } else if (product.equals("jelly beans")) {
            JellyBeansBuilder jellyBeansBuilder = new JellyBeansBuilder();
            candySeller.makeJellyBellyJellyBeans(jellyBeansBuilder);
            return jellyBeansBuilder.getProduct();
        } else if (product.equals("lollipop")) {
            LollipopBuilder lollipopBuilder = new LollipopBuilder();
            candySeller.makeJellyBellyLollipop(lollipopBuilder);
            return lollipopBuilder.getProduct();
        } else if (product.equals("mint")) {
            MintBuilder mintBuilder = new MintBuilder();
            candySeller.makeJellyBellyMint(mintBuilder);
            return mintBuilder.getProduct();
        } else {
            return null;
        }

    }
}
