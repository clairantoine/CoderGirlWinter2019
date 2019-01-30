package com.jetbrains;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)

    {Scanner keyboard = new Scanner(System.in);
//This program calculates the cost of any 3 grocery items a user inputs.

        String item1;
        String item2;
        String item3;

//Request info from user. Need names of 3 grocery items
        out.print("Please list the first of three items on your grocery shopping list.");
        item1 = Keyboard.nextLine();
        out.print("Please list the second of three items on your grocery shopping list.");
        item2 = Keyboard.nextLine();
        out.print("Please list the third of three items on your grocery shopping list.");
        item3 = Keyboard.nextLine();
    }

    //Request info from user. Need quantity of each grocery item.***
        {   ("Please enter (numerically) the quantity of "+item1+ "you'd like to purchase.");
    quant1 = Keyboard.nextInt();
    ("Please enter (numerically) the quantity of "+item2+ "you'd like to purchase.");
    quant2 = Keyboard.nextInt();
    ("Please enter (numerically) the quantity of "+item3+ "you'd like to purchase.");
    quant3 = Keyboard.nextInt();
    }

    //Request info from user. Need cost of each item (in american dollars and cents).
    { float item1CostEach;
    float item2CostEach;
    float item3CostEach;
    out.print("How much does one" +item1+" cost?");
        item1Cost = keyboard.nextFloat();
        out.print("How much does one" +item2+" cost?");
        item2Cost = keyboard.nextFloat();
        out.print("How much does one" +item3+" cost?");
        item3Cost = keyboard.nextFloat();
    }

    //Calculates total cost to buy each item at quantity specified by user
    {float totalcost1;
    float totalcost2;
    float totalcost3;

    totalcost1 = (quant1 * item1CostEach);
    totalcost2 = (quant2 * item2CostEach);
    totalcost3 = (quant3 * item3CostEach);

    }

    //Adds each total item cost together (variable = totalcost1/2/3),
    //Reaches total cost for all items (variable = totalAll)
    //Prints that value.
    {float totalAll;
    totalAll = (totalcost1 + totalcost2 + totalcost3);
        out.println("Your total cost is"+totalAll+" .");}


//just realized the code for each type of item should be grouped together.
    //If I enter "item1" as "apples", I should then be able to enter the quant & cost of apples
    //not move to the next item. Confusing for user.
}
