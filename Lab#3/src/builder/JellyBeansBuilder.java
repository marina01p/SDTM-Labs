package builder;

import domain.candy.JellyBeans;

public class JellyBeansBuilder implements CandyBuilder {
    private JellyBeans jellyBeans;

    public JellyBeansBuilder(){
        this.reset();
    }

    @Override
    public void reset() {
        this.jellyBeans = new JellyBeans();
    }

    @Override
    public void setProduct(String nameProduct) {
        this.jellyBeans.setProduct(nameProduct);
    }

    @Override
    public void setManufacturer(String manufacturer) {
        this.jellyBeans.setManufacturer(manufacturer);
    }

    @Override
    public void setComposition(boolean sugarFree) {
        this.jellyBeans.setComposition(sugarFree);
    }

    @Override
    public void setPrice(double price) {
        this.jellyBeans.setPrice(price);
    }

    public JellyBeans getProduct(){
        JellyBeans product = this.jellyBeans;
        this.reset();
        return product;
    }
}
