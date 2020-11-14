package adapter;

import domain.candy.Candy;
import domain.packet.Packet;

public class PacketAdapter implements Candy {
    private final Packet pack;

    public PacketAdapter(Packet packet){
        this.pack =  packet;
    }

    @Override
    public String toString() {
        return pack.toString();
    }

    @Override
    public void setProduct(String productName) {

    }

    @Override
    public void setManufacturer(String manufacturer) {

    }

    @Override
    public void setComposition(boolean sugarFree) {

    }

    @Override
    public void setPrice(double price) {

    }
}
