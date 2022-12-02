package ru.mirea.seventhpart.task2;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Действительная часть комплексного числа: ");
        double currRe = in.nextDouble();
        System.out.print("Мнимая часть действительного числа: ");
        double currIm = in.nextDouble();
        MathFunc mc1 = new MathFunc(currRe, currIm);
        System.out.println(mc1.absCompl());
        System.out.println(mc1.powCompl());
        System.out.println(mc1);
    }

}