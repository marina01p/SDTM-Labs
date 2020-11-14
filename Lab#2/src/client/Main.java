package client;

import domain.packet.GiftBox;
import domain.packet.PlasticBag;
import adapter.PacketAdapter;
import factory.AbstractFactory;
import factory.HariboFactory;
import factory.JellyBellyFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {


        System.out.println("Welcome to this Online Candy Store!\n");
        System.out.println("==============================");
        System.out.println("List of our products: \n" +
                "1. Jelly \n" +
                "2. Hard Candy");
        System.out.println("==============================");

        BufferedReader productLine = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the desired product type: ");
        String name = productLine.readLine();

        System.out.println("==============================");
        System.out.println("List of our products: \n" +
                "1. Haribo \n" +
                "2. Jelly Belly");
        System.out.println("==============================");

        BufferedReader factoryLine = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the desired factory : ");
        String name1 = factoryLine.readLine();

        AbstractFactory hariboFactory = HariboFactory.getHariboInstance();
        AbstractFactory jellyBellyFactory = JellyBellyFactory.getJellyBellyInstance();


        switch (name.toLowerCase()) {
            case "jelly":
                switch (name1.toLowerCase()) {
                    case "all":
                        System.out.println("\n------ Jelly ------");
                        System.out.println("\n- H A R I B O -");
                        System.out.println(hariboFactory.sellCandy("jelly beans").toString());
                        System.out.println(hariboFactory.sellCandy("sour jelly").toString());
                        System.out.println("\n- J E L L Y   B E L L Y -");
                        System.out.println(jellyBellyFactory.sellCandy("sour jelly").toString());
                        System.out.println(jellyBellyFactory.sellCandy("jelly beans").toString());
                        break;
                    case "haribo":
                        System.out.println("\n------ Jelly ------");
                        System.out.println("\n- H A R I B O -");
                        System.out.println(hariboFactory.sellCandy("jelly beans").toString());
                        System.out.println(hariboFactory.sellCandy("sour jelly").toString());
                        break;
                    case "jelly belly":
                        System.out.println("\n- J E L L Y   B E L L Y -");
                        System.out.println(jellyBellyFactory.sellCandy("sour jelly").toString());
                        System.out.println(jellyBellyFactory.sellCandy("jelly beans").toString());
                        break;
                    default:
                        System.out.println("You entered an invalid utilities.factory.");
                }
                break;

            case "hard candy":
                switch (name1.toLowerCase()) {
                    case "all":
                        System.out.println("\n------ Hard Candy ------");
                        System.out.println("\n- H A R I B O -");
                        System.out.println(hariboFactory.sellCandy("lollipop").toString());
                        System.out.println(hariboFactory.sellCandy("mint").toString());
                        System.out.println("\n- J E L L Y   B E L L Y -");
                        System.out.println(jellyBellyFactory.sellCandy("lollipop").toString());
                        System.out.println(jellyBellyFactory.sellCandy("mint").toString());
                        break;
                    case "haribo":
                        System.out.println("\n------ Hard Candy ------");
                        System.out.println("\n- H A R I B O -");
                        System.out.println(hariboFactory.sellCandy("lollipop").toString());
                        System.out.println(hariboFactory.sellCandy("mint").toString());
                        break;
                    case "jelly belly":
                        System.out.println("\n------ Hard Candy ------");
                        System.out.println("\n- J E L L Y   B E L L Y -");
                        System.out.println(jellyBellyFactory.sellCandy("lollipop").toString());
                        System.out.println(jellyBellyFactory.sellCandy("mint").toString());
                        break;
                    default:
                        System.out.println("You entered an invalid factory.");
                }
                break;

            default:
                System.out.println("You entered an invalid product.");
        }


        BufferedReader purchaseLine = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\nEnter the desired product and name of the factory (x, y): ");
        String name2 = purchaseLine.readLine();


        switch (name2.toLowerCase().replace(",", "")) {
            case "sour jelly haribo":
                System.out.println(hariboFactory.sellCandy("sour jelly").toString());
                break;
            case "sour jelly jelly belly":
                System.out.println(jellyBellyFactory.sellCandy("sour jelly").toString());
                break;
            case "jelly beans haribo":
                System.out.println(hariboFactory.sellCandy("jelly beans").toString());
                break;
            case "jelly beans jelly belly":
                System.out.println(jellyBellyFactory.sellCandy("jelly beans").toString());
                break;
            case "lollipop haribo":
                System.out.println(hariboFactory.sellCandy("lollipop").toString());
                break;
            case "lollipop jelly belly":
                System.out.println(jellyBellyFactory.sellCandy("lollipop").toString());
                break;
            case "mint haribo":
                System.out.println(hariboFactory.sellCandy("mint").toString());
                break;
            case "mint jelly belly":
                System.out.println(jellyBellyFactory.sellCandy("mint").toString());
                break;
            default:
                System.out.println("Invalid product name.");

        }

        System.out.println("\n====================================");
        System.out.println("Our Packages:");
        System.out.println("====================================");

        GiftBox giftBox = new GiftBox();
        PlasticBag plasticBag = new PlasticBag();
        PacketAdapter giftBoxAdapter = new PacketAdapter(giftBox);
        PacketAdapter plasticBagAdapter = new PacketAdapter(plasticBag);

        System.out.println(giftBoxAdapter);
        System.out.println(plasticBagAdapter);
        System.out.println("\nChoose a package for your purchase:");

        BufferedReader purchasePacket = new BufferedReader(new InputStreamReader(System.in));
        String packageChooser = purchasePacket.readLine();
        switch(packageChooser.toLowerCase()) {
            case "gift box":
                System.out.println("Thank you for your purchase! (+500 points to your karma for being ECO friendly)");
                break;
            case "plastic bag":
                System.out.println("Thank you for your purchase!");
                break;
            default:
                System.out.println("Invalid product! Try again");
        }

    }
}









