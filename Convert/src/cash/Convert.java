package cash;

import java.util.Scanner;

public class Convert {
	
	
// Find total number of dollars
    public static int dollars(int total)
    {
        return total/100;
    }
    
 // Find total number of quarters
    public static int quarters(int total)
    {
        return (total - dollars(total)*100)/25;
    }

 // Find total number of dimes
    public static int dimes(int total)
    {
        return (total -(dollars(total)*100) - (quarters(total)*25)) /10;
    }

 // Find total number of nickels
    public static int nickels(int total)
    {
        return (total - (dollars(total)*100) - (quarters(total)*25) - (dimes(total)*10)) / 5;
    }
    
 // Find total number of pennies
    public static int pennies(int total)
    {
        return total - (dollars(total)*100) - (quarters(total)*25) - (dimes(total)*10) - (nickels(total)*5);
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String total;
        int intTotal;

     // prompt the user to enter amount
        System.out.println("Please enter the total amount:");
        total = keyboard.next();

        total = total.replace(".","");
        intTotal = Integer.parseInt(total);

        System.out.println(dollars(intTotal) + " Dollars,"
                +quarters(intTotal) + " Quarters,"
                +dimes(intTotal) + " Dimes,"
                +nickels(intTotal) + " Nickels,"
                +pennies(intTotal) + " Pennies");

    }
    }




