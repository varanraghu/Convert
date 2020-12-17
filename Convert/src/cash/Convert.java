package cash;

import java.util.Scanner;

public class Convert {
    public static int dollars(int total)
    {
        return total/100;
    }
    public static int quarters(int total)
    {
        return total/25;
    }

    public static int dimes(int total)
    {
        return (total - quarters(total)*25) /10;
    }

    public static int nickels(int total)
    {
        return (total - (quarters(total)*25) - (dimes(total)*10)) / 5;
    }

    public static int pennies(int total)
    {
        return total - (quarters(total)*25) - (dimes(total)*10) - (nickels(total)*5);
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String total;
        int intTotal;

        System.out.println("Please enter in the total amount of dollars and cents:");
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




