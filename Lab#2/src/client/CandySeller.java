package client;

import builder.*;

public class CandySeller {

    public CandyBuilder makeJellyBellySourJelly(SourJellyBuilder builder){
        builder.reset();
        builder.setProduct("Sour Jelly");
        builder.setManufacturer("Jelly Belly");
        builder.setComposition(true);
        builder.setPrice(1.25);
        return builder;
    }

    public CandyBuilder makeJellyBellyJellyBeans(JellyBeansBuilder builder){
        builder.reset();
        builder.setProduct("Jelly Beans");
        builder.setManufacturer("Jelly Belly");
        builder.setComposition(true);
        builder.setPrice(3.15);
        return builder;
    }

    public CandyBuilder makeJellyBellyLollipop(LollipopBuilder builder){
        builder.reset();
        builder.setProduct("Lollipop");
        builder.setManufacturer("Jelly Belly");
        builder.setComposition(true);
        builder.setPrice(0.65);
        return builder;
    }

    public CandyBuilder makeJellyBellyMint(MintBuilder builder){
        builder.reset();
        builder.setProduct("Mint");
        builder.setManufacturer("Jelly Belly");
        builder.setComposition(true);
        builder.setPrice(0.15);
        return builder;
    }


//--------------------------------H A R I B O-------------------------------------------------

    public CandyBuilder makeHariboSourJelly(SourJellyBuilder builder){
        builder.reset();
        builder.setProduct("Sour Jelly");
        builder.setManufacturer("Haribo");
        builder.setComposition(true);
        builder.setPrice(1.95);
        return builder;
    }

    public CandyBuilder makeHariboJellyBeans(JellyBeansBuilder builder){
        builder.reset();
        builder.setProduct("Jelly Beans");
        builder.setManufacturer("Haribo");
        builder.setComposition(true);
        builder.setPrice(3.75);
        return builder;
    }

    public CandyBuilder makeHariboLollipop(LollipopBuilder builder){
        builder.reset();
        builder.setProduct("Lollipop");
        builder.setManufacturer("Haribo");
        builder.setComposition(true);
        builder.setPrice(1.00);
        return builder;
    }

    public CandyBuilder makeHariboMint(MintBuilder builder){
        builder.reset();
        builder.setProduct("Mint");
        builder.setManufacturer("Haribo");
        builder.setComposition(true);
        builder.setPrice(0.35);
        return builder;
    }


}
