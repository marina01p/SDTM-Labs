package domain.packet;

public class GiftBox implements Packet {
    private String productName = "Gift Box";
    private boolean isBio = true;
    private double price = 2.00;

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
