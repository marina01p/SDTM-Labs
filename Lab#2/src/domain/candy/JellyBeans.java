package domain.candy;

public class JellyBeans implements Candy {
    private String productName;
    private String manufacturer;
    private boolean sugarFree;
    private String flavour = "Sugar";
    private double price;

    @Override
    public void setProduct(String productName) {
        this.productName = productName;
    }

    @Override
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public void setComposition(boolean sugarFree) {
        this.sugarFree = sugarFree;
    }
    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    @Override
    public String toString() {
        return "\nProduct: " + productName +
                "\nManufacturer: " + manufacturer +
                "\nSugar Free: " + sugarFree +
                "\nPrice : " + price + "$" +
                "\nFlavour: " + flavour;
    }
}