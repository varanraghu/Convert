package com.converter.Dinterface.impl;

import com.converter.Dinterface.IConverterMoney;

public class USDConverter implements IConverterMoney {
    @Override
    public String convertMoney(int cash) {

        int dollars= cash/100;


        int quaters= Math.round((int)(cash%100)/25);

        int dimes = Math.round((int)((cash%100)%25)/10);


        int nickels = Math.round((int)(cash%100)%25%10/5);

        int pennies = Math.round((int)(cash%100)%25%10%5/1);

        return "Dollars:"+dollars+", Quaters:"+quaters+" Dimes: "+dimes+" nickels: "+nickels+ " pennies: "+pennies;
    }
}
