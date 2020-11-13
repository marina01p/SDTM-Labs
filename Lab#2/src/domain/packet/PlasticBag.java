package domain.packet;

public class PlasticBag implements Packet {
    private String productName = "Plastic Bag";
    private boolean isBio = false;
    private double price = 0.20;

    public void setProduct(String productName) {
        this.productName = productName;
    }

    public void setConstitution(boolean isBio) {
        this.isBio = isBio;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "\nProduct: " + productName +
                "\nBiodegradable: " + isBio +
                "\nPrice : " + price + "$";
    }
}

