package Creational_Design_Patterns.Candy;

public class JellyBeans implements Creational_Design_Patterns.Candy.Candy {
    private String productName;
    private String manufacturer;
    private boolean sugarFree;
    private double price;

    public void setProduct(String productName) {
        this.productName = productName;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public void setComposition(boolean sugarFree) {
        this.sugarFree = sugarFree;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "\nProduct: " + productName +
                "\nManufacturer: " + manufacturer +
                "\nSugar Free: " + sugarFree +
                "\nPrice : " + price + "$";
    }
}
