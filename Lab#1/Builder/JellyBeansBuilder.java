package Creational_Design_Patterns.Builder;

import Creational_Design_Patterns.Candy.JellyBeans;

public class JellyBeansBuilder implements Creational_Design_Patterns.Builder.CandyBuilder {
    private JellyBeans jellyBeans;

    public JellyBeansBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.jellyBeans = new JellyBeans();
    }

    @Override
    public void setProduct(String productName) {
        this.jellyBeans.setProduct(productName);
    }

    @Override
    public void setManufacturer(String manufacturer) {
        this.jellyBeans.setManufacturer(manufacturer);
    }

    public void setComposition(boolean sugarFree) {
        this.jellyBeans.setComposition(sugarFree);
    }

    @Override
    public void setPrice(double price) {
        this.jellyBeans.setPrice(price);
    }

    public JellyBeans getProduct() {
        JellyBeans product = this.jellyBeans;
        this.reset();
        return product;
    }
}
