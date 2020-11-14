package domain.packet;

public class PlasticBag implements Packet {
    private String name = "Plastic Bag";
    private boolean isBio = false;
    private double price = 0.2;

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
