/**Kings APCSA Fall20
 * Author Name: 
 * Assignment: Unit 1 Review
 */

import java.util.Scanner;

public class Unit1Review {
    public static void main(String[] args){ //Do not edit this main method for the assignment.
        problem1(); //20 points
        problem2(); //20 points
        problem3(); //20 points
        problem4(); //20 points
        problem5(); //20 points
    }
    /**
     * ----------------------------------------------------------------------------------------------------
     * PROBLEM 1 - HOT DIGGITY DOG
     * ----------------------------------------------------------------------------------------------------
     */
    public static void problem1(){        
        /**
         * Write a program that asks the user how many hot dogs they want.
         * Hotdogs cost $2.50 each. 
         * Tax is 7%.         
         * Print out the cost, the tax, and the total cost including tax.
         * (You MUST use camelCase correctly at least once!)
         * (don’t worry about the decimals printing out like 12.5 instead of 12.50)
         */
        System.out.println("----------- Problem 1 -----------"); //Do not delete this line.
        
        //Asks user how many hotdogs, stores entered number in variable numHotDogs
        System.out.print("How many hot dogs do you want?: ");
        Scanner scan = new Scanner(System.in);
        int numHotDogs = scan.nextInt(); //If you want the user to input a String, use a String variable and scan.nextLine() instead of scan.nextInt()
        scan.close(); 

        //Write your Problem 1 program below this line, and don't go below the next curly brace until problem 2

    }

    /**
     * ----------------------------------------------------------------------------------------------------
     * PROBLEM 2 - TEMPERATURE CONVERTER
     * ----------------------------------------------------------------------------------------------------
     */
    public static void problem2(){        
        /**
         * Write a program that converts Fahrenheit to Celsius. 
         * The formula is C = (5/9) * (F-32). 
         * The user will enter the Farenheit and the program will print out the Celsius.
         * (You MUST use casting!) Test your program with several values!
         * sample data: 12 F is -11 C , -40 F is -40 C
         */
        System.out.println("----------- Problem 2 -----------"); //Do not delete this line.
        
        //Using Problem 1 as an example, ask the user for the temperature with the Scanner class
        

         //Write the rest of your Problem 2 program below this line


         //What values did you test and confirm that they work? Answer here: 

    }
    /**
     * ----------------------------------------------------------------------------------------------------
     * PROBLEM 3 - VOLLEYBALL TEAM MAKER
     * ----------------------------------------------------------------------------------------------------
     */
    public static void problem3(){        
        /**
            Volleyball teams can have 6 players. Write a program where the
            user enters a number of students in a class and then displays
            how many teams can be formed, and how many players will be left
            over. Ex: if the user enters 38, the program will show 6 teams
            and 2 left over. (You MUST using integer math or modulus!)
         */
        System.out.println("----------- Problem 3 -----------"); //Do not delete this line.
         //Write your Problem 3 program below this line, including any scanner inputs you need.

    }
    /**
     * ----------------------------------------------------------------------------------------------------
     * PROBLEM 4 - LOOSE CHANGE
     * ----------------------------------------------------------------------------------------------------
     */
    public static void problem4(){        
        /**
            The user will enter how many cents they have. Your program will
            display how many quarters, dimes, nickels, and pennies are
            required to make this amount. Use as many quarters as possible,
            then as many dimes, etc…(you MUST use compound operators!)
            For example, if the user enters 83 cents, the program should
            print out
            Quarters: 3
            Dimes: 0
            Nickels: 1
            Pennies: 3
         */
        System.out.println("----------- Problem 4 ----------- "); //Do not delete this line.
         //Write your Problem 4 program below this line

    }

    /**
     * ----------------------------------------------------------------------------------------------------
     * PROBLEM 5 - YOUR CHOICE
     * ----------------------------------------------------------------------------------------------------
     */
    public static void problem5(){        
        /**
            Write a program that does whatever you'd like! 
            Could be some type of calculator that would be somewhat useful to you,
            or a different type of unit converter like the problems you've done 
            in this assignment already, or something totally different. 
            If you can't come up with an idea, create a budget calculator
            for the area you live in, and the income of a typical hourly job
            at a fast food restaurant or similar. Include apartment rent, car payment/insurance,
            groceries, etc. 
         */
        System.out.println("----------- Problem 5 ----------- "); //Do not delete this line.
         //Write your Problem 5 program below this line

    }
}
