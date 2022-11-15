package ru.mirea.thirdpart.formating;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Shop {

    private double amountVal = 0.0;
    private int currentValuta = 0;

    public void setAmountVal(double amountVal) {
        this.amountVal = amountVal;
    }

    public void setCurrentValuta(int currentValuta) {
        this.currentValuta = currentValuta;
    }

    public double getAmountVal(double amountVal) {
        return amountVal;
    }

    public int getCurrentValuta(int currentValuta) {
        return currentValuta;
    }

    public void choiceValutaRub(double amountVal, int currentValuta) {
        if (this.currentValuta == currentValuta)  this.amountVal = amountVal;
        else {
            if (currentValuta == 2) this.amountVal  = amountVal / 58.75;
            else this.amountVal = amountVal / 60.78;
        }
        this.currentValuta = currentValuta;
    }
    public void choiceValutaUsd(int currentValuta) {
        if (this.currentValuta == currentValuta)  this.amountVal = this.amountVal;
        else {
            if (currentValuta == 1) this.amountVal  = this.amountVal * 60.78;
            else this.amountVal = this.amountVal * 60.78 / 58.75;
        }
        this.currentValuta = currentValuta;
    }

    public Shop(double amountVal, int currentValuta) { // the key is ruble
        this.amountVal = amountVal;
        this.currentValuta = currentValuta;
        if (currentValuta < 1 || currentValuta > 3) {
            System.out.println("Некорректное значение!");
            System.exit(0);
        }
    }

    public Shop(double amountVal) { // the key is ruble
        this.amountVal = amountVal;
    }

    //public void showInfo(double amountVal, int currentValuta) {
    //}

    public String valutaInfo(int currentValuta) {
        if (currentValuta == 1) return "RUB";
        else if (currentValuta == 2) return "USD";
        else return "EURO";
    }

    @Override
    public String toString() {
        return "[Валюта: " + valutaInfo(currentValuta) + ", стоимость: " + amountVal + "]";
    }

}

class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int currentValuta = in.nextInt();
        double currentAmount = in.nextInt();
        Shop currentMag = new Shop(currentAmount, currentValuta);
        currentMag.choiceValutaRub(currentAmount, currentValuta);
        System.out.println(currentMag);
        currentMag.choiceValutaRub(currentAmount, 2);
        System.out.println(currentMag);
        currentMag.choiceValutaRub(currentAmount, 3);
        System.out.println(currentMag);
        double secondAmount = 3000;
        Shop otherMag = new Shop(secondAmount, 2);
        otherMag.choiceValutaUsd(1);
        System.out.println(otherMag);
        otherMag.choiceValutaUsd(2);
    }
}