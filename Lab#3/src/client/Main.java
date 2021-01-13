package client;

import adapter.PacketAdapter;
import chain_of_responsibility.Director;
import chain_of_responsibility.Request;
import chain_of_responsibility.RequestType;
import chain_of_responsibility.VP;
import domain.packet.GiftBox;
import domain.packet.PlasticBag;
import facade.CandyFacade;
import factory.AbstractFactory;
import factory.HariboFactory;
import factory.JellyBellyFactory;
import interpreter.Expression;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static interpreter.Interpreter.buildInterpreterTree;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String DOUBLE_DELIMITER = ANSI_BLUE + "================================" + ANSI_RESET;
    public static final String SINGLE_DELIMITER = ANSI_BLUE + "--------------------------------" + ANSI_RESET;


    public static void main(String[] args) throws IOException {


        AbstractFactory jellyBellyFactory = JellyBellyFactory.getJellyBellyFactory();
        AbstractFactory hariboFactory = HariboFactory.getHariboFactory();
        CandyFacade candyFacade = new CandyFacade(jellyBellyFactory);

        PlasticBag plasticBag = new PlasticBag();
        GiftBox giftBox = new GiftBox();

        PacketAdapter plasticBagAdapter = new PacketAdapter(plasticBag);
        PacketAdapter giftBoxAdapter = new PacketAdapter(giftBox);


        System.out.println(DOUBLE_DELIMITER);
        System.out.println(ANSI_BLUE + "          CANDY STORE" + ANSI_RESET);


        while (true) {

            BufferedReader rsqLine = new BufferedReader(new InputStreamReader(System.in));

            System.out.println(DOUBLE_DELIMITER);
            System.out.println("             ENTER\n" + SINGLE_DELIMITER +
                    "\n- f - : search for a product" +
                    "\n- r - : view regular products" +
                    "\n- s - : view special products" +
                    "\n- e - : quite" +
                    "\n- o - : rate our store");
            System.out.println(DOUBLE_DELIMITER);

            String rsq = rsqLine.readLine();

            switch (rsq.toLowerCase()) {

                // search bar
                case "f":
                    BufferedReader searchLine = new BufferedReader(new InputStreamReader(System.in));
                    System.out.println(DOUBLE_DELIMITER);
                    System.out.println("           SEARCH BAR           ");
                    System.out.println("search for a product or factory:");
                    System.out.println(DOUBLE_DELIMITER);

                    String searchProduct = searchLine.readLine();
                    Expression define = buildInterpreterTree();

                    switch (searchProduct.toLowerCase().replaceAll("\\s", "")) {
                        case "mint":
                        case "sourjelly":
                        case "lollipop":
                        case "jellybeans":
                            System.out.println("Desired product -" + searchProduct + "- is currently: ");
                            if (define.interpret(searchProduct)) {
                                System.out.println(ANSI_GREEN + "Available. Check it out!" + ANSI_RESET);
                            } else {
                                System.out.println(ANSI_RED + "Not Available, sorry!" + ANSI_RESET);
                            }
                            break;
                        case "haribo":
                        case "jellybelly":
                            System.out.println("Desired Factory -" + searchProduct + "- is currently: ");
                            if (define.interpret(searchProduct)) {
                                System.out.println(ANSI_GREEN + "Available. Check it out!" + ANSI_RESET);
                            } else {
                                System.out.println(ANSI_RED + "Not Available, sorry!" + ANSI_RESET);
                            }
                        default:
                    }

                    break;

                // regular products
                case "r":
                    System.out.println(DOUBLE_DELIMITER);
                    System.out.println("        - MANUFACTURERS -\n" +
                            "1. Haribo \n" +
                            "2. Jelly Belly");
                    System.out.println(SINGLE_DELIMITER);

                    BufferedReader productLine = new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("Enter the desired factory: ");
                    System.out.println(DOUBLE_DELIMITER);
                    String factoryName = productLine.readLine();

                    switch (factoryName) {
                        case "haribo":

                            System.out.println(DOUBLE_DELIMITER);
                            System.out.println("        - H A R I B O -");
                            System.out.println(SINGLE_DELIMITER);
                            System.out.println(hariboFactory.sellCandy("lollipop").toString());
                            System.out.println(hariboFactory.sellCandy("mint").toString());
                            System.out.println(hariboFactory.sellCandy("jellyBelly").toString());
                            System.out.println(hariboFactory.sellCandy("sourJelly").toString());
                            System.out.println("\n" + SINGLE_DELIMITER);

                            BufferedReader confirmLine = new BufferedReader(new InputStreamReader(System.in));

                            System.out.println("Confirm your purchase with 'y' " + "\nor exit the store with 'e': ");
                            System.out.println(DOUBLE_DELIMITER);

                            String confirmName = confirmLine.readLine();

                            switch (confirmName) {
                                case "y":
                                    System.out.println(DOUBLE_DELIMITER);
                                    System.out.println("     - P A C K A G E S -      ");
                                    System.out.println(SINGLE_DELIMITER);
                                    System.out.println(giftBoxAdapter);
                                    System.out.println(plasticBagAdapter + "\n");

                                    BufferedReader packetLine = new BufferedReader(new InputStreamReader(System.in));
                                    System.out.println(SINGLE_DELIMITER);
                                    System.out.println("Enter the desired packet name: ");
                                    System.out.println(DOUBLE_DELIMITER);
                                    String packetName = packetLine.readLine();

                                    switch (packetName) {
                                        case "gift box":
                                            System.out.println("\n" + DOUBLE_DELIMITER);
                                            System.out.println(ANSI_GREEN + "Thank you for your purchase!\n(+500 points to your karma for being ECO friendly)" + ANSI_RESET);
                                            System.out.println(DOUBLE_DELIMITER);
                                            break;
                                        case "plastic bag":
                                            System.out.println("\n" + DOUBLE_DELIMITER);
                                            System.out.println(ANSI_PURPLE + "Thank you for your purchase!" + ANSI_RESET);
                                            System.out.println(DOUBLE_DELIMITER);
                                            break;
                                        default:
                                            System.out.println(ANSI_RED + "Invalid product! Try again" + ANSI_RESET);
                                    }
                                    break;

                                case "e":
                                    System.out.println(DOUBLE_DELIMITER);
                                    System.out.println(ANSI_GREEN + "Thanks for choosing our candy store!" + ANSI_RESET);
                                    System.out.println(DOUBLE_DELIMITER);
                                    break;
                                default:
                                    System.out.println(ANSI_RED + "Invalid letter. Try again!" + ANSI_RESET);
                            }
                            break;


                        case "sour jelly":

                            System.out.println(DOUBLE_DELIMITER);
                            System.out.println("  - J E L L Y   B E L L Y -  ");
                            System.out.println(SINGLE_DELIMITER);

                            System.out.println(jellyBellyFactory.sellCandy("lollipop").toString());
                            System.out.println(jellyBellyFactory.sellCandy("mint").toString());
                            System.out.println(jellyBellyFactory.sellCandy("jellyBelly").toString());
                            System.out.println(jellyBellyFactory.sellCandy("sourJelly").toString());
                            System.out.println("\n" + SINGLE_DELIMITER);

                            BufferedReader confirmLine5 = new BufferedReader(new InputStreamReader(System.in));
                            System.out.println("Confirm your purchase with 'y' " + "\nor exit the store with 'e': ");
                            System.out.println(DOUBLE_DELIMITER);

                            String confirmName5 = confirmLine5.readLine();

                            switch (confirmName5.toLowerCase()) {
                                case "y":
                                    System.out.println(DOUBLE_DELIMITER);
                                    System.out.println("     - P A C K A G E S -      ");
                                    System.out.println(SINGLE_DELIMITER);
                                    System.out.println(giftBoxAdapter);
                                    System.out.println(plasticBagAdapter + "\n");

                                    BufferedReader packetLine = new BufferedReader(new InputStreamReader(System.in));
                                    System.out.println(SINGLE_DELIMITER);
                                    System.out.println("Enter the desired packet name: ");
                                    System.out.println(DOUBLE_DELIMITER);
                                    String packetName = packetLine.readLine();

                                    switch (packetName) {
                                        case "gift box":
                                            System.out.println("\n" + DOUBLE_DELIMITER);
                                            System.out.println(ANSI_GREEN + "Thank you for your purchase!\n(+500 points to your karma for being ECO friendly)" + ANSI_RESET);
                                            System.out.println(DOUBLE_DELIMITER);
                                            break;
                                        case "plastic bag":
                                            System.out.println("\n" + DOUBLE_DELIMITER);
                                            System.out.println(ANSI_PURPLE + "Thank you for your purchase!" + ANSI_RESET);
                                            System.out.println(DOUBLE_DELIMITER);
                                            break;
                                        default:
                                            System.out.println(ANSI_RED + "Invalid product! Try again" + ANSI_RESET);
                                    }
                                    break;

                                case "e":
                                    System.out.println(DOUBLE_DELIMITER);
                                    System.out.println(ANSI_GREEN + "Thanks for choosing our candy store!" + ANSI_RESET);
                                    System.out.println(DOUBLE_DELIMITER);
                                    break;
                                default:
                                    System.out.println(ANSI_RED + "Invalid letter. Try again!" + ANSI_RESET);
                            }

                            break;
                        default:
                            System.out.println(ANSI_RED + "Invalid command. Try again!" + ANSI_RESET);
                    }
                    break;

                // special products
                case "s":
                    System.out.println(DOUBLE_DELIMITER);
                    System.out.println("\n- S P E C I A L   F L A V O U R S -");
                    System.out.println(SINGLE_DELIMITER);

                    System.out.println(candyFacade.getCandy("mint", "Cherry", "Twizzlers"));
                    System.out.println(candyFacade.getCandy("lollipop", "Strawberry", "Chupa Chyps"));
                    System.out.println(candyFacade.getCandy("jellyBelly", "Coca Cola", "Starbust"));
                    System.out.println(candyFacade.getCandy("sourJelly", "Lemon", "Sour Patch"));
                    System.out.println("\n" + SINGLE_DELIMITER);

                    BufferedReader confirmLine6 = new BufferedReader(new InputStreamReader(System.in));

                    System.out.println("Confirm your purchase with 'y' " + "\nor exit the store with 'e': ");
                    System.out.println(DOUBLE_DELIMITER);

                    String confirmName6 = confirmLine6.readLine();

                    switch (confirmName6.toLowerCase()) {
                        case "y":
                            System.out.println(DOUBLE_DELIMITER);
                            System.out.println("     - P A C K A G E S -      ");
                            System.out.println(SINGLE_DELIMITER);
                            System.out.println(giftBoxAdapter);
                            System.out.println(plasticBagAdapter + "\n");

                            BufferedReader packetLine = new BufferedReader(new InputStreamReader(System.in));
                            System.out.println(SINGLE_DELIMITER);
                            System.out.println("Enter the desired packet name: ");
                            System.out.println(DOUBLE_DELIMITER);
                            String packetName = packetLine.readLine();

                            switch (packetName) {
                                case "gift box":
                                    System.out.println("\n" + DOUBLE_DELIMITER);
                                    System.out.println(ANSI_GREEN + "Thank you for your purchase!\n(+500 points to your karma for being ECO friendly)" + ANSI_RESET);
                                    System.out.println(DOUBLE_DELIMITER);
                                    break;
                                case "plastic bag":
                                    System.out.println("\n" + DOUBLE_DELIMITER);
                                    System.out.println(ANSI_PURPLE + "Thank you for your purchase!" + ANSI_RESET);
                                    System.out.println(DOUBLE_DELIMITER);
                                    break;
                                default:
                                    System.out.println(ANSI_RED + "Invalid product! Try again" + ANSI_RESET);
                            }
                            break;
                        case "e":
                            System.out.println(DOUBLE_DELIMITER);
                            System.out.println(ANSI_GREEN + "Thanks for choosing our candy store!" + ANSI_RESET);
                            System.out.println(DOUBLE_DELIMITER);
                            break;
                        default:
                            System.out.println(ANSI_RED + "Invalid command. Try again!" + ANSI_RESET);
                    }
                    break;

                // exit
                case "e":
                    System.out.println(DOUBLE_DELIMITER);
                    System.out.println(ANSI_BLUE + "Thanks for choosing our candy store!" + ANSI_RESET);
                    System.out.println(DOUBLE_DELIMITER);
                    System.exit(0);
                    break;

                case "o":
                    System.out.println(DOUBLE_DELIMITER);
                    System.out.println("          - RATE US -");
                    System.out.println("please leave the number of stars");
                    System.out.println("       within range [1-5]");
                    System.out.println(DOUBLE_DELIMITER);
                    BufferedReader reviewLine = new BufferedReader(new InputStreamReader(System.in));
                    String review = reviewLine.readLine();

                    Director bill = new Director();
                    VP annie = new VP();

                    bill.setSuccessor(annie);

                    switch (review) {
                        case "5":
                        case "4":
                        case "3":
                            System.out.println(DOUBLE_DELIMITER);
                            Request request = new Request(RequestType.GOOD_REVIEW, 5);
                            bill.handleRequest(request);
                            break;
                        case "2":
                        case "1":
                            request = new Request(RequestType.BAD_REVIEW, 2);
                            bill.handleRequest(request);
                            break;
                        default:
                            System.out.println(ANSI_RED + "Wrong number of stars. Try again!" + ANSI_RESET);
                    }

                    break;
                default:
                    System.out.println(ANSI_RED + "Invalid command. Try again!" + ANSI_RESET);


            }

        }
    }
}