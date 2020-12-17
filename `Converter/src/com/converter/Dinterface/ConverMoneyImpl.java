package com.converter.Dinterface;

import com.converter.Dinterface.impl.USDConverter;

import java.util.Scanner;

public class ConverMoneyImpl {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter Currency ");

        // String input
        String currency = myObj.nextLine();
        System.out.println("Enter cash ");
        // Numerical input
        int cash = myObj.nextInt();

        ConverterFactory converterFactory=new ConverterFactory();

        IConverterMoney converter = converterFactory.getConverter(currency);

     if(converter!=null){
         System.out.println(converter.convertMoney(cash));
     }

    }
}
