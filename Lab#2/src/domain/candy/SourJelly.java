package domain.candy;

public class SourJelly implements Candy {
    private String productName;
    private String manufacturer;
    private boolean sugarFree;
    private double price;

    public void setProduct(String productName) { this.productName = productName; }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public void setComposition(boolean sugarFree) {
        this.sugarFree = sugarFree;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nProduct: " + productName +
                "\nManufacturer: " + manufacturer +
                "\nSugar Free: " + sugarFree +
                "\nPrice : " + price + "$";
    }

}
