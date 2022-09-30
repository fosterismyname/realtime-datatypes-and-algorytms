package ru.mirea.secondpart;

import java.util.Scanner;

public class Task2_2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double x, y;

        System.out.print("x: ");
        x = in.nextInt();
        System.out.print("y: ");
        y = in.nextInt();

        Ball currentBall = new Ball(x, y);
        System.out.println(currentBall);
        currentBall.setX(10);
        currentBall.setY(-10);
        System.out.println(currentBall);
        currentBall.setXY(0, 20);
        System.out.println(currentBall);
        System.out.print("X change: ");
        x = in.nextDouble();
        System.out.print("У change: ");

        y = in.nextDouble();
        currentBall.move(x, y);
        System.out.println(currentBall);
    }

}

class Ball {
    private double x, y;

    public Ball() {};

    public Ball (double x, double y) {
        this.x = 0.0;
        this.y = 0.0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }

    public void setXY (double x, double y) {
        setX(x);
        setY(y);
    }

    public void move(double xDisp, double yDisp) {
        setX(x + xDisp);
        setY(y + yDisp);
    }

    @Override
    public String toString() {
        return "Ball: [" + "x = " + x + ", y = " + y + "]";
    }
}