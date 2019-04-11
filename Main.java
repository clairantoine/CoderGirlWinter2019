package com.jetbrains;

public class Main {

    public static void main(String[] args)
    {
     int temps [][]= new int [4][7];
                temps[0][0]= 68;
                temps[0][1]= 70;
                temps[0][2]= 76;
                temps[0][3]= 70;
                temps[0][4]= 68;
                temps[0][5]= 71;
                temps[0][6]= 75;
                temps[1][0]= 76;
                temps[1][1]= 76;
                temps[1][2]= 87;
                temps[1][3]= 84;
                temps[1][4]= 82;
                temps[1][5]= 75;
                temps[1][6]= 83;
                temps[2][0]= 73;
                temps[2][1]= 72;
                temps[2][2]= 81;
                temps[2][3]= 78;
                temps[2][4]= 76;
                temps[2][5]= 73;
                temps[2][6]= 77;
                temps[3][0]= 64;
                temps[3][1]= 65;
                temps[3][2]= 69;
                temps[3][3]= 68;
                temps[3][4]= 70;
                temps[3][5]= 74;
                temps[3][6]= 72;

        String timeOfDay[]= {"7AM", "3PM", "7PM", "3AM"};

        System.out.print("Temperature Calculator");
        System.out.println("The data provided are:");
     for(int row=0; row<4; row++)
        {
            System.out.print(timeOfDay[row]+": ");
                for(int column= 0; column<7; column++)
         {
                if (column<6)
                {
                    System.out.print(temps[row][column] + ", ");
                }
                else
                 {
                    System.out.print(temps[row][column]+" ");
                 }
         }
         System.out.println();
        }
        System.out.println("\nBased on that data, the following are the average temperatures for the week\n");


     String daysOfWeek[]= {"Sun:", "Mon:", "Tue:", "Wed:", "Thu:", "Fri:", "Sat:"};
//Loop for average temp of each time slot
        int daysLoop = 0;
        int workingAmount = 0;
        for( int times = 0 ; times<4; times++)
        {
         workingAmount = workingAmount + temps[times][daysLoop];
            System.out.println(workingAmount/4);
        }



    }
}