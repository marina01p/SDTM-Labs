package domain.packet;

public class GiftBox implements Packet {
    private String name = "Gift Box";
    private boolean isBio = true;
    private double price = 2.00;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setConstitution(boolean isBio) {
        this.isBio = isBio;
    }

    @Override
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
