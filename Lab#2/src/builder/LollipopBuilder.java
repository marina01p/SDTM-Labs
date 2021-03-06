package builder;

import domain.candy.Lollipop;

public class LollipopBuilder implements CandyBuilder {
    private Lollipop lollipop;

    public LollipopBuilder(){
        this.reset();
    }

    @Override
    public void reset() {
        this.lollipop = new Lollipop();
    }

    @Override
    public void setProduct(String nameProduct) {
        this.lollipop.setProduct(nameProduct);
    }

    @Override
    public void setManufacturer(String manufacturer) {
        this.lollipop.setManufacturer(manufacturer);
    }

    @Override
    public void setComposition(boolean sugarFree) {
        this.lollipop.setComposition(sugarFree);
    }

    @Override
    public void setPrice(double price) {
        this.lollipop.setPrice(price);
    }

    public Lollipop getProduct(){
        Lollipop product = this.lollipop;
        this.reset();
        return product;
    }
}
