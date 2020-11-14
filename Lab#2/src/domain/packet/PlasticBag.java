package domain.packet;

public class PlasticBag implements Packet {
    private String name = "Plastic Bag";
    private boolean isBio = false;
    private double price = 0.2;

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
