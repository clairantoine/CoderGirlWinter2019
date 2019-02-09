package com.jetbrains;
import java.util.Scanner;

// These are weird imports. You shouldn't need them
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;
import static jdk.nashorn.internal.objects.Global.print;

/**This code allows user to input amount of items sold to
 check if daily sale goal was met.
 Variables:
vegSandwich - need to sell 50/day
 burGers - need to sell min 250/day
 subs - need to sell min 180/day
 soup - need to sell 70/day
 Prints either "Made goal" or "Fell short" if daily min was met.
*/

public class SandwichShop {

    public static void main(String[] args) {
       {
            Scanner keyboard = new Scanner(System.in);

            // Missing period in all System.out.println() statements
            System out.println("Enter the number of veggie sandwiches sold today.");
            int vegSandwich = keyboard.nextInt();
            keyboard.skip("\n");
            /* Brackets are needed when using if-else. It should look like this. Note the 
              parenthesis () around the conditional and brackets {} around the blocks of code
              
            if (condition) {
              // block of code to be executed if the condition is true
            } else { 
              // block of code to be executed if the condition is false
            }
            
            */
                if(vegSandwich >= 50)
                    System out.println("Made Goal");
                else(System out.println("Fell short"));

            System out.println("Enter the number of burgers sold today.");
            int burGers = keyboard.nextInt();
            keyboard.skip("\n");
                if(burGers >= 250)
                    System out.println("Made goal");
                else(System out.println("Fell short"))

            System out.println("Enter the number of sub sandwiches sold today.");
            int subs = keyboard.nextInt();
            keyboard.skip("\n");
                if(subs >= 180)
                    System out.println("Made Goal");
                else(System out.println("Fell short"));

            System out.println("Enter number of cups of soup sold today.");
            int soup = keyboard.nextInt()
            keyboard.skip("\n");
                if(soup >= 70)
                    System out.println("Made Goal");
                else(System out.println("Fell short"));
    }
}
