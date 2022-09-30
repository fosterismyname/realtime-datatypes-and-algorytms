package ru.mirea.secondpart;

import java.util.Scanner;

class Circle {

    private double x = 0.0;
    private double y = 0.0;
    private double r = 1.0;

    public Circle(double x, double y, double r) {

        this.x = x;
        this.y = y;
        if (r < 0) {
            System.out.println("Incorrect radius");
            System.exit(0);
        }
        this.r = r;
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getR() {
        return r;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double circleArea() {
        return Math.PI * this.r * this.r;
    }

    public double circumferenceLength() {
        return 2 * Math.PI * this.r;
    }

    public void circleCheck(Circle secondCircle) {

        System.out.println(" ");
        if (this.circleArea() == secondCircle.circleArea()) {
            System.out.println("1. Areas match");
        } else System.out.println("1. Areas don't match");

        if (this.getX() == secondCircle.getX() && this.getY() == secondCircle.getY()) {
            System.out.println("2. Center coordinates match.");
        } else System.out.println("2. Center coordinates don't match.");

        if (this.getR() == secondCircle.getR()) {
            System.out.println("3. Radius match.");
        } else System.out.println("3. Radius don't match.");

        // Пересение окружностей -->
        double d = Math.sqrt(Pow((this.getX() - secondCircle.getX()), 2) + Pow((this.getY() - secondCircle.getY()), 2));
        if (this.getR() + secondCircle.getR() > d) {
            System.out.println("4. Circumferences overlap.");
        } else System.out.println("4. Circumferences don't overlap.");

    }
    public void circleComprasion(Circle secondCircle) {
        if (this.circleArea() == secondCircle.circleArea()) {
            System.out.println("Circumferences match.");
        } else System.out.print("Circumferences don't  match (not equal areas).");

    }
    public double Pow(double exp, int power) {
        double result = 1.0;
        for (int i = 0; i < power; i++) {
            result = result * exp;
        }
        return result;
    }

    @Override
    public String toString() {
        return "Current circle: [x = " + x + ", y = " + y + ", r = " + r + "]";
    }
}

public class Task2_6 {

    public static void main(String[] args) {

        Circle firstCircle = new Circle(1.0, 1.0, 1.0);
        firstCircle.setX(3.0);
        firstCircle.setY(5.0);
        firstCircle.setR(10.0);

        Circle secondCircle = new Circle(1.0, 1.0, 1.0);
        secondCircle.setX(-3.0);
        secondCircle.setY(-5.0);
        secondCircle.setR(10.0);

        System.out.println("S: " + firstCircle.circleArea());
        System.out.println("L: " + secondCircle.circumferenceLength());

        firstCircle.circleCheck(secondCircle);
    }
}