package domain.packet;

public interface Packet {
    void setProduct(String productName);
    void setConstitution(boolean isBio);
    void setPrice(double price);
}
