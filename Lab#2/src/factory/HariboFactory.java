package factory;

import domain.candy.Candy;
import builder.JellyBeansBuilder;
import builder.LollipopBuilder;
import builder.MintBuilder;
import builder.SourJellyBuilder;

public class HariboFactory implements AbstractFactory {

    private static volatile HariboFactory hariboFactory;
    private final CandySeller candySeller = new CandySeller();

    private HariboFactory() {}

    public static HariboFactory getHariboFactory() {
        if (hariboFactory == null)
            hariboFactory = new HariboFactory();
        return hariboFactory;
    }

    @Override
    public Candy sellCandy(String type) {
        switch (type) {
            case "lollipop":
                LollipopBuilder lollipopHariboBuilder = new LollipopBuilder();
                candySeller.makeHariboLollipop(lollipopHariboBuilder);
                return lollipopHariboBuilder.getProduct();
            case "mint":
                MintBuilder mintHariboBuilder = new MintBuilder();
                candySeller.makeHariboMint(mintHariboBuilder);
                return mintHariboBuilder.getProduct();
            case "jellyBelly":
                JellyBeansBuilder jellyBeansHariboBuilder = new JellyBeansBuilder();
                candySeller.makeHariboJellyBeans(jellyBeansHariboBuilder);
                return jellyBeansHariboBuilder.getProduct();
            case "sourJelly":
                SourJellyBuilder sourJellyHariboBuilder = new SourJellyBuilder();
                candySeller.makeHariboSourJelly(sourJellyHariboBuilder);
                return sourJellyHariboBuilder.getProduct();
            default:
                return  null;
        }
    }
}
