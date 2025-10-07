package com.pluralsight;

import java.util.Scanner;

public class FamousQuoteApp {
    public static void main(String[]args) {
        System.out.println("Hello and welcome!");


        String[] quotes = {
                "There is No Tommorrow Rocky There is No Tomorrow - Apollo Creed",
                "Family. - Vin Diesel",
                " Your time is Up My Time is Now - John Cena",
                " The courageous fallen, the anguished fallen, their lives have meaning because we, the living refuse to forget them and as we ride to certain death, we trust our successors to do the same for us! Because my soldiers do not buckle or yield when faced with the cruelty of this world! MY SOLDIERS PUSH FORWARD! MY SOLDIERS SCREAM OUT! MY SOLDIERS RAGE! - Commander Erwin    "

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

