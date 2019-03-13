package com.jetbrains;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print ("Welcome to the Multiplication Tables");
        System.out.print("\n" +
                "How large would you like to see them?\n" +
                "(enter a number smaller than 20)");

        int userNumber = keyboard.nextInt();
        keyboard.skip("\n");
        System.out.print(" "+userNumber);
        int counter = 0;

        if (userNumber >= 20)
        {
            System.out.println("Error. Please enter a number smaller than 20");
        }
        else
        {
            for (int answer= 0; counter < userNumber; counter++)
            { answer= counter * userNumber;
                System.out.println("" +counter+ " * " +userNumber+ " = " +answer+"");
            }
        }

    }
}
