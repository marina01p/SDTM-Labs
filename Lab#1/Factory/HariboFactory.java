package Creational_Design_Patterns.Factory;

import Creational_Design_Patterns.Candy.Builder.*;
import Creational_Design_Patterns.Candy.Candy;
import Creational_Design_Patterns.CandySeller;

public class HariboFactory implements Creational_Design_Patterns.Factory.AbstractFactory {

    private static HariboFactory hariboFactory;
    private CandySeller candySeller = new CandySeller();

    private HariboFactory() {}

    public static HariboFactory getHariboFactory() {
        if (hariboFactory == null)
            hariboFactory = new HariboFactory();
        return hariboFactory;
    }

    @Override
    public Candy sellCandy(String product) {
        switch (product) {
            case "sour jelly":
                SourJellyBuilder sourJellyBuilder = new SourJellyBuilder();
                candySeller.makeHariboSourJelly(sourJellyBuilder);
                return sourJellyBuilder.getProduct();
            case "jelly beans":
                JellyBeansBuilder jellyBeansBuilder = new JellyBeansBuilder();
                candySeller.makeHariboJellyBeans(jellyBeansBuilder);
                return jellyBeansBuilder.getProduct();
            case "lollipop":
                LollipopBuilder lollipopBuilder = new LollipopBuilder();
                candySeller.makeHariboLollipop(lollipopBuilder);
                return lollipopBuilder.getProduct();
            case "mint":
                MintBuilder mintBuilder = new MintBuilder();
                candySeller.makeHariboMint(mintBuilder);
                return mintBuilder.getProduct();
            default:
                return  null;
        }
    }
}
