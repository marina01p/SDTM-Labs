package Creational_Design_Patterns.Candy.Builder;

public interface CandyBuilder {
    void reset();
    void setProduct(String productName);
    void setManufacturer(String manufacturer);
    void setComposition(boolean sugarFree);
    void setPrice(double price);
}
