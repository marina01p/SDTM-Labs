package domain.packet;

public class GiftBox implements Packet {
    private String name = "Gift Box";
    private boolean isBio = true;
    private double price = 2.00;


    public void setName(String name) {
        this.name = name;
    }

    public void setConstitution(boolean isBio) {
        this.isBio = isBio;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nPackage: " + name +
                "\nBiodegradable: " + isBio +
                "\nPrice : " + price + "$";
    }
}
