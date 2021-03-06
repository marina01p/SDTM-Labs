package builder;

import domain.candy.SourJelly;

public class SourJellyBuilder implements CandyBuilder {
    private SourJelly sourJelly;

    public SourJellyBuilder(){
        this.reset();
    }

    @Override
    public void reset() {
        this.sourJelly = new SourJelly();
    }

    @Override
    public void setProduct(String nameProduct) {
        this.sourJelly.setProduct(nameProduct);
    }

    @Override
    public void setManufacturer(String manufacturer) {
        this.sourJelly.setManufacturer(manufacturer);
    }

    @Override
    public void setComposition(boolean sugarFree) {
        this.sourJelly.setComposition(sugarFree);
    }

    @Override
    public void setPrice(double price) {
        this.sourJelly.setPrice(price);
    }

    public SourJelly getProduct(){
        SourJelly product = this.sourJelly;
        this.reset();
        return product;
    }
}
