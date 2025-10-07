package com.pluralsight;

import java.util.Scanner;

public class FamousQuoteApp {
    public static void main(String[]args) {
        System.out.println("Hello and welcome!");


        String[] quotes = {
                "There is No Tommorrow Rocky There is No Tomorrow - Apollo Creed",
                "Family. - Vin Diesel",
                " Your time is Up My Time is Now - John Cena",
                " The courageous fallen, the anguished fallen, their lives have meaning because we, the living refuse to forget them and as we ride to certain death, we trust our successors to do the same for us! Because my soldiers do not buckle or yield when faced with the cruelty of this world! MY SOLDIERS PUSH FORWARD! MY SOLDIERS SCREAM OUT! MY SOLDIERS RAGE! - Commander Erwin",
                " Hakuna Matata what a wonderful phrase Hakuna Matata i means no worry for the rest of your days - Lion King ",
                " Is that supposed to be insulting? You say I'm arrogant, I say damn right. That's pride. Pride in the Saiyan I am: the mighty prince of the ultimate warrior race! Impossible to defeat you? Don't make me laugh! I won't surrender control, that's not the man I am! Let Kakarot use his thoughtless Ultra Instinct all he wants! But I'm the one who's going to crush you, Jiren! And I'll do it my way!" ,
                "Be Like Paul - Paul ",
                "You're either Perfect or not me - Perfect Cell",
                "May the Force be with you. — Star Wars",
                "My mama always said life was like a box of chocolates. — Forrest Gump "

        };

        // Ask the user for a number between 1 and 10
        System.out.print("Please enter a number between 1 and 10, inclusive: ");

        Scanner scanner = new Scanner(System.in);

        // Read the number
        int inputNumber = scanner.nextInt();
        scanner.nextLine();

        // Test input and validate
        if (inputNumber <1 || inputNumber >10){
            System.out.println("""
                    Ooops!  That number I can't deal with.
                        I only do numbers between 1 and 10
                        Please try again.""");
            System.exit(1);
        }
        // Subtract one from user input, and use as an index into the array
        inputNumber--;

        // Example: print a quote

        System.out.println("Thank you for your number!  Here is a famous quote:");
        System.out.println(quotes[inputNumber]);


        scanner.close();
    }

    }

