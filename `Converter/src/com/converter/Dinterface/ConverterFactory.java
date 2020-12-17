package com.converter.Dinterface;

import com.converter.Dinterface.impl.USDConverter;

public class ConverterFactory {
    public IConverterMoney getConverter(String currency){
        switch (currency){

            case "USD" :

                return new USDConverter();
            case "EURO":
                //Todo same for EURO


            case "Rupiah":


            default:

                System.out.println("New Currency added ; Please specify to admin");

                System.exit(0);

        }
        return null;
    }
}
