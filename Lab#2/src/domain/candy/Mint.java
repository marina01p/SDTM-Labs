package domain.candy;

public class Mint implements Candy{
    private String productName;
    private String manufacturer;
    private boolean sugarFree;
    private double price;
    private String flavour = "Sugar";

    public void setProduct(String productName) {
        this.productName = productName;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setComposition(boolean sugarFree) {
        this.sugarFree = sugarFree;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    @Override
    public String toString() {
        return "\nProduct: " + productName +
                "\nManufacturer: " + manufacturer +
                "\nSugar Free: " + sugarFree +
                "\nFlavour: " + flavour +
                "\nPrice : " + price + "$";
    }
}
