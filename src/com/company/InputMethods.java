package com.company;
import java.util.Scanner;

public class InputMethods {

    public static void main(String[] args) {
    inputSize();
    inputColour();
    inputBrand();
    }

    public static void inputSize () {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! We are glad that you are using our shoes store.\n" +
                "Please use the filters for easier and faster search!\n " +
                "\n What is your size?");
        int size = input.nextInt();
        if (size<35)
            System.out.println("Sorry, at the moment there's no sizes for children! \n" +
                    "Try the Little Puh shoes store!");
        else if (size>=35 && size<=45)
            System.out.println("Filter added!");
        else if (size<45)
            System.out.println("Sorry, at the moment there's no such big sizes! \n" +
                    "Try the Gulliver shoes store!");
        else
            System.out.println("Invalid value");

        //jāpievieno opcija, kāmēr netiek uzstādīts filtrs, tikmēr nevar pāriet pie nākamā jautājuma

    }
    public static void inputColour () {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWhat colour do you prefer?\n" +
                "Write R for red, W for white, B for black, BR for brown:");
        String colour = input.next();
        switch (colour) {
            case "R": case "W": case "B": case "BR":
                System.out.println("Your choise is added to the filter!");
                break;
            default:
                System.out.println("At the moment there is no such colour! \n" +
                        "Choose from existing ones or came back on December 1st, we are going to have new collection!");
                break;
        }
    //jāpievieno opcija, kāmēr netiek uzstādīts filtrs, tikmēr nevar pāriet pie nākamā jautājuma
    }

    public static void inputBrand () {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWhat brand do you prefer?\n" +
                "Write RL for Ralph Lauren, TM for Tommy Hilfiger, CK for Calvin Klein, KL for Karl Lagerfeld:");
        String brand = input.next();
        switch (brand) {
            case "RL": case "TM": case "CK": case "KL":
                System.out.println("Your choise is added to the filter!");
                break;
            default:
                    System.out.println("At the moment there is no such brand! \n" +
                            "We are working on expanding our assortment!");
                    break;
        }

        //jāpievieno opcija, kāmēr netiek uzstādīts filtrs, tikmēr nevar pāriet pie nākamā jautājuma
    }

}
