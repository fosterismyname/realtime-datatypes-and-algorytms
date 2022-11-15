package ru.mirea.thirdpart;

import java.util.Scanner;

public class SecondPart {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //1
        Double firstVal = Double.valueOf(12);
        Double secondVal = Double.valueOf(9);
        System.out.println(firstVal);
        System.out.println(secondVal);

        //2
        String parsed;
        System.out.print("String: ");
        parsed = in.nextLine();
        Double parsedVal = Double.parseDouble(parsed);
        System.out.println(parsedVal);

        //3-4
        Double thirdVal = Double.valueOf(13.45);
        int intVal = thirdVal.intValue();
        System.out.println(intVal);
        double doubleVal = thirdVal.doubleValue();
        System.out.println(doubleVal);
        byte byteVal = thirdVal.byteValue();
        System.out.println(byteVal);
        short shortVal = thirdVal.shortValue();
        System.out.println(shortVal);
        float floatVal = thirdVal.floatValue();
        System.out.println(floatVal);
        long longVal = thirdVal.longValue();
        System.out.println(longVal);

        //5
        String fourthVal = Double.toString(3.14);
        System.out.println(fourthVal);

        Boolean example = Boolean.valueOf(true);

    }

}