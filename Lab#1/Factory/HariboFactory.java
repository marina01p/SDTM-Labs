package Creational_Design_Patterns.Factory;

import Creational_Design_Patterns.Builder.*;
import Creational_Design_Patterns.Candy.Candy;
import Creational_Design_Patterns.CandySeller;

public class HariboFactory implements Creational_Design_Patterns.Factory.AbstractFactory {

    private static HariboFactory hariboFactory;
    private CandySeller candySeller = new CandySeller();

    private HariboFactory() {
    }

    public static HariboFactory getHariboInstance() {
        if (hariboFactory == null)
            hariboFactory = new HariboFactory();
        return hariboFactory;
    }

    @Override
    public Candy sellCandy(String product) {
        if (product.equals("sour jelly")) {
            SourJellyBuilder sourJellyBuilder = new SourJellyBuilder();
            candySeller.makeHariboSourJelly(sourJellyBuilder);
            return sourJellyBuilder.getProduct();
        } else if (product.equals("jelly beans")) {
            SourJellyBuilder sourJellyBuilder = new SourJellyBuilder();
            candySeller.makeHariboSourJelly(sourJellyBuilder);
            return sourJellyBuilder.getProduct();
        } else if (product.equals("lollipop")) {
            LollipopBuilder lollipopBuilder = new LollipopBuilder();
            candySeller.makeHariboLollipop(lollipopBuilder);
            return lollipopBuilder.getProduct();
        } else if (product.equals("mint")) {
            MintBuilder mintBuilder = new MintBuilder();
            candySeller.makeHariboMint(mintBuilder);
            return mintBuilder.getProduct();
        } else {
            return null;
        }

    }
}
