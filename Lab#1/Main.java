package Creational_Design_Patterns;

import Creational_Design_Patterns.Factory.*;

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

        AbstractFactory hariboFactory = HariboFactory.getHariboFactory();
        AbstractFactory jellyBellyFactory = JellyBellyFactory.getJellyBellyFactory();


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
                        System.out.println("You entered an invalid factory.");
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
    }
}









