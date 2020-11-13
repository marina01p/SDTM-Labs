package utilities.builder;

import domain.candy.Mint;

public class MintBuilder implements utilities.builder.CandyBuilder {
    private Mint mint;

    public MintBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.mint = new Mint();
    }

    @Override
    public void setProduct(String productName) {
        this.mint.setProduct(productName);
    }

    @Override
    public void setManufacturer(String manufacturer) {
        this.mint.setManufacturer(manufacturer);
    }

    @Override
    public void setComposition(boolean sugarFree) {
        this.mint.setComposition(sugarFree);
    }

    @Override
    public void setPrice(double price) {
        this.mint.setPrice(price);
    }

    public Mint getProduct() {
        Mint product = this.mint;
        this.reset();
        return product;
    }
}