package com.company;
import java.sql.*;
import java.util.Scanner;

public class Main {

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
        System.out.println("\n What colour do you prefer?\n" +
                "Write R for red, W for white, B for black, BR for brown");
        String colour = input.next();
        if (colour == "R" || colour == "W" || colour == "B" || colour == "BR")
            System.out.println("Your choise is add to the filter!");
        else
            System.out.println("At the moment there is no such colour! \n" +
                    "Choose from existing ones or came back on December 1st, we are going to have new collection!");

    //jāpievieno opcija, kāmēr netiek uzstādīts filtrs, tikmēr nevar pāriet pie nākamā jautājuma
    }

    public static void inputBrand () {
        Scanner input = new Scanner(System.in);
        System.out.println("\n What brand do you prefer?\n" +
                "Write RL for Ralph Lauren, TM for Tommy Hilfiger, CK for Calvin Klein, KL for Karl Lagerfeld");
        String brand = input.next();
        if (brand == "RL" || brand == "TM" || brand == "CK" || brand == "KL")
            System.out.println("Your choise is add to the filter!");
        else
            System.out.println("At the moment there is no such brand! \n" +
                "We are working on expanding our assortment!");

        //jāpievieno opcija, kāmēr netiek uzstādīts filtrs, tikmēr nevar pāriet pie nākamā jautājuma
    }

}
