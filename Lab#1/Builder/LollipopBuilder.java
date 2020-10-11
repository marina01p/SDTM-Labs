package Creational_Design_Patterns.Builder;

import Creational_Design_Patterns.Candy.Lollipop;

public class LollipopBuilder implements Creational_Design_Patterns.Builder.CandyBuilder {
    private Lollipop lollipop;

    public LollipopBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.lollipop = new Lollipop();
    }

    @Override
    public void setProduct(String productName) {
        this.lollipop.setProduct(productName);
    }

    @Override
    public void setManufacturer(String manufacturer) {
        this.lollipop.setManufacturer(manufacturer);
    }

    public void setComposition(boolean sugarFree) {
        this.lollipop.setComposition(sugarFree);
    }

    @Override
    public void setPrice(double price) {
        this.lollipop.setPrice(price);
    }

    public Lollipop getProduct() {
        Lollipop product = this.lollipop;
        this.reset();
        return product;
    }
}
