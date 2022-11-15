package ru.mirea.thirdpart.formating;

import java.sql.SQLOutput;
import java.util.Scanner;

class ConverterVal {

    private double firstVal = 0.0;
    private double secondVal = 0.0;
    private double thirdVal = 0.0;

    public ConverterVal(double firstVal, double secondVal, double thirdVal) {

        this.firstVal = firstVal;
        this.secondVal = secondVal;
        this.thirdVal = thirdVal;
    }

    public void setVal(double Val) {
        this.thirdVal = Val;
    }

    public void setFirstVal(int firstVal) {
        this.firstVal = firstVal;
    }

    public void setSecondVal(int secondVal) {
        this.secondVal = secondVal;
    }

    public double toUsd(double Val) {
        return (Val / firstVal);
    }

    public double toEuro(double Val) {
        return (Val / secondVal);
    }

    public double toRub(double Val) {
        return(Val / thirdVal);
    }

}

class MainTester {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Currency: 1 - USD; 2 - EURO; 3 - RUB");
        System.out.print("Currency: ");
        int currentVal = in.nextInt();
        ConverterVal currentConverter = new ConverterVal(20.58, 109.45, 167.89);

        while (currentVal > 3 || currentVal < 1) {
            System.out.println("Invalid input");
            System.out.print("Currency: ");
            currentVal = in.nextInt();
        }
        System.out.print("Amount: ");
        int amountVal = in.nextInt();
        System.out.println("Convert to: 1 - USD; 2 - EURO; 3 - RUB");
        System.out.print("Conver to: ");
        int optVal = in.nextInt();

        while (optVal > 3 || optVal < 1) {
            System.out.println("Invalid input");
            System.out.print("Convert to: ");
            optVal = in.nextInt();
        }

        switch (optVal) {
            case 1:
                if (optVal == 4 - currentVal) System.out.println(amountVal);
                else System.out.println("Result: " + currentConverter.toUsd(amountVal));
                break;
            case 2:
                if (optVal == 4 - currentVal) System.out.println(amountVal);
                else System.out.println("Result: " + currentConverter.toEuro(amountVal));
                break;
            case 3:
                if (optVal == 4 - currentVal) System.out.println(amountVal);
                else System.out.println("Result: " + currentConverter.toRub(amountVal));
        }
    }
}