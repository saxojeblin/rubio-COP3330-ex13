/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {

        double principal, rate, time, comp_times, total;
        String strPrincipal, strRate, strTime, strCompTimes;
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the principal amount? ");
        strPrincipal = sc.next();
        System.out.print("What is the rate? ");
        strRate = sc.next();
        System.out.print("What is the number of years? ");
        strTime = sc.next();
        System.out.print("What is the number of times the interest is compounded per year? ");
        strCompTimes = sc.next();

        principal = Double.parseDouble(strPrincipal);
        rate = Double.parseDouble(strRate) / 100;
        time = Double.parseDouble(strTime);
        comp_times = Double.parseDouble(strCompTimes);

        total = principal * Math.pow((1 + rate/comp_times), (comp_times * time));

        System.out.printf("$%s invested at %s%% for %s years compounded %s times per year is $%.2f", strPrincipal, strRate, strTime, strCompTimes, total);
    }

}
