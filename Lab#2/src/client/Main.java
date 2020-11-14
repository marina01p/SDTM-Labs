package client;

import domain.packet.GiftBox;
import domain.packet.PlasticBag;
import adapter.PacketAdapter;
import facade.CandyFacade;
import factory.AbstractFactory;
import factory.HariboFactory;
import factory.JellyBellyFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        AbstractFactory jellyBellyFactory = JellyBellyFactory.getJellyBellyFactory();
        AbstractFactory hariboFactory = HariboFactory.getHariboFactory();
        CandyFacade candyFacade = new CandyFacade(jellyBellyFactory);

        PlasticBag plasticBag = new PlasticBag();
        GiftBox giftBox = new GiftBox();

        PacketAdapter plasticBagAdapter = new PacketAdapter(plasticBag);
        PacketAdapter giftBoxAdapter = new PacketAdapter(giftBox);

        System.out.println("==============================");
        System.out.println("         CANDY STORE          ");
        System.out.println("==============================");



        BufferedReader rsqLine = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 'r' for regular products, 's' for special products or 'e' to quite: ");
        String rsq = rsqLine.readLine();

        switch(rsq.toLowerCase()) {
            case "r":

                System.out.println("==============================");
                System.out.println("         - MANUFACTURERS -       \n" +
                        "1. Haribo \n" +
                        "2. Jelly Belly");
                System.out.println("==============================");

                BufferedReader productLine = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the desired factory: ");
                String factoryName = productLine.readLine();

                switch(factoryName) {
                    case "haribo":

                        System.out.println("\n      - H A R I B O -       ");
                        System.out.println(hariboFactory.sellCandy("lollipop").toString());
                        System.out.println(hariboFactory.sellCandy("mint").toString());
                        System.out.println(hariboFactory.sellCandy("jellyBelly").toString());
                        System.out.println(hariboFactory.sellCandy("sourJelly").toString());

                        BufferedReader confirmLine = new BufferedReader(new InputStreamReader(System.in));
                        System.out.println("Confirm your purchase with 'y' or exit the store with 'e': ");
                        String confirmName = confirmLine.readLine();

                        switch(confirmName) {
                            case "y":

                                System.out.println("\n      - P A C K A G E S -      ");
                                System.out.println(giftBoxAdapter);
                                System.out.println(plasticBagAdapter);

                                BufferedReader packetLine = new BufferedReader(new InputStreamReader(System.in));
                                System.out.println("\nEnter the desired packet name: ");
                                String packetName = packetLine.readLine();

                                switch(packetName) {
                                    case "gift box":
                                        System.out.println("Thank you for your purchase! (+500 points to your karma for being ECO friendly)");
                                        break;
                                    case "plastic bag":
                                        System.out.println("Thank you for your purchase!");
                                        break;
                                    default:
                                        System.out.println("Invalid product! Try again");
                                }
                                break;

                            case "e":
                                System.out.println("Thanks for choosing our candy store!");
                                break;
                            default:
                                System.out.println("Invalid letter. Try again!");
                        }
                        break;


                    case "sour jelly":

                        System.out.println("\n  - J E L L Y   B E L L Y -  ");

                        System.out.println(jellyBellyFactory.sellCandy("lollipop").toString());
                        System.out.println(jellyBellyFactory.sellCandy("mint").toString());
                        System.out.println(jellyBellyFactory.sellCandy("jellyBelly").toString());

                        BufferedReader confirmLine5 = new BufferedReader(new InputStreamReader(System.in));
                        System.out.println("Confirm your purchase with 'y' or exit the store with 'e': ");
                        String confirmName5 = confirmLine5.readLine();

                        switch(confirmName5.toLowerCase()) {
                            case "y":

                                System.out.println("\n      - P A C K A G E S -      ");
                                System.out.println(giftBoxAdapter);
                                System.out.println(plasticBagAdapter);

                                BufferedReader packetLine = new BufferedReader(new InputStreamReader(System.in));
                                System.out.println("\nEnter the desired packet name: ");
                                String packetName = packetLine.readLine();

                                switch(packetName.toLowerCase()) {
                                    case "gift box":
                                        System.out.println("Thank you for your purchase! (+500 points to your karma for being ECO friendly)");
                                        break;
                                    case "plastic bag":
                                        System.out.println("Thank you for your purchase!");
                                        break;
                                    default:
                                        System.out.println("Invalid product! Try again");
                                }
                                break;

                            case "e":
                                System.out.println("Thanks for choosing our candy store!");
                                break;
                            default:
                                System.out.println("Invalid letter. Try again!");
                        }

                        break;
                    default:
                        System.out.println("Invalid words. Try again!");
                }
                break;


            case "s":
                System.out.println("\n- S P E C I A L   F L A V O U R S -");

                System.out.println(candyFacade.getCustomFurniture("mint", "Cherry", "My Style"));
                System.out.println(candyFacade.getCustomFurniture("lollipop", "Strawberry", "Custom Style"));
                System.out.println(candyFacade.getCustomFurniture("jellyBelly", "Coca Cola", "My own style"));

                BufferedReader confirmLine6 = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Confirm your purchase with 'y' or exit the store with 'e': ");
                String confirmName6 = confirmLine6.readLine();

                switch(confirmName6.toLowerCase()) {
                    case "y":

                        System.out.println("\n      - P A C K A G E S -      ");
                        System.out.println(giftBoxAdapter);
                        System.out.println(plasticBagAdapter);

                        BufferedReader packetLine7 = new BufferedReader(new InputStreamReader(System.in));
                        System.out.println("\nEnter the desired packet name: ");
                        String packetName7 = packetLine7.readLine();

                        switch(packetName7.toLowerCase()) {
                            case "gift box":
                                System.out.println("Thank you for your purchase! (+500 points to your karma for being ECO friendly)");
                                break;
                            case "plastic bag":
                                System.out.println("Thank you for your purchase!");
                                break;
                            default:
                                System.out.println("Invalid product! Try again");
                        }
                        break;

                    case "e":
                        System.out.println("Thanks for choosing our candy store!");
                        break;
                    default:
                        System.out.println("Invalid letter. Try again!");
                }
                break;
            default:
                System.out.println("Invalid command. Try again!");
        }


    }
}