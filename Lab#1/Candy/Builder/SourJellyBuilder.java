package Creational_Design_Patterns.Candy.Builder;

import Creational_Design_Patterns.Candy.SourJelly;

public class SourJellyBuilder implements Creational_Design_Patterns.Candy.Builder.CandyBuilder {
    private SourJelly sourJelly;

    public SourJellyBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.sourJelly = new SourJelly();
    }

    @Override
    public void setProduct(String productName) {
        this.sourJelly.setProduct(productName);
    }

    @Override
    public void setManufacturer(String manufacturer) {
        this.sourJelly.setManufacturer(manufacturer);
    }

    public void setComposition(boolean sugarFree) {
        this.sourJelly.setComposition(sugarFree);
    }

    @Override
    public void setPrice(double price) {
        this.sourJelly.setPrice(price);
    }

    public SourJelly getProduct() {
        SourJelly product = this.sourJelly;
        this.reset();
        return product;
    }
}
