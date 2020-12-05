package factory;

import builder.JellyBeansBuilder;
import builder.LollipopBuilder;
import builder.MintBuilder;
import builder.SourJellyBuilder;
import domain.candy.Candy;

public class JellyBellyFactory implements AbstractFactory {

    private static volatile JellyBellyFactory jellyBellyFactory;
    private final CandySeller candySeller = new CandySeller();

    private JellyBellyFactory() {}

    public static JellyBellyFactory getJellyBellyFactory() {
        if (jellyBellyFactory == null)
            jellyBellyFactory = new JellyBellyFactory();
        return jellyBellyFactory;
    }

    @Override
    public Candy sellCandy(String type) {
        switch (type){
            case "lollipop":
                LollipopBuilder lollipopJellyBuilder = new LollipopBuilder();
                candySeller.makeJellyBellyLollipop(lollipopJellyBuilder);
                return lollipopJellyBuilder.getProduct();
            case "mint":
                MintBuilder mintJellyBuilder = new MintBuilder();
                candySeller.makeJellyBellyMint(mintJellyBuilder);
                return mintJellyBuilder.getProduct();
            case "jellyBelly":
                JellyBeansBuilder jellyBeansJellyBuilder = new JellyBeansBuilder();
                candySeller.makeJellyBellyJellyBeans(jellyBeansJellyBuilder);
                return jellyBeansJellyBuilder.getProduct();
            case "sourJelly":
                SourJellyBuilder sourJellyJellyBellyBuilder = new SourJellyBuilder();
                candySeller.makeJellyBellySourJelly(sourJellyJellyBellyBuilder);
                return sourJellyJellyBellyBuilder.getProduct();
            default:
                return null;
        }
    }
}
