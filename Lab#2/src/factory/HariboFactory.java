package factory;

import client.CandySeller;
import domain.candy.Candy;
import builder.*;

public class HariboFactory implements AbstractFactory {

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
            JellyBeansBuilder jellyBeansBuilder = new JellyBeansBuilder();
            candySeller.makeHariboJellyBeans(jellyBeansBuilder);
            return jellyBeansBuilder.getProduct();
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
