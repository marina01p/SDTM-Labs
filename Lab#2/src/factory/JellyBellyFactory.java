package factory;

import client.CandySeller;
import domain.candy.Candy;
import builder.*;

public class JellyBellyFactory implements AbstractFactory {

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
