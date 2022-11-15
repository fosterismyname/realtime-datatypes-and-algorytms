package ru.mirea.thirdpart.Task3_2;


class Circle extends Point {

    private double r = 1.0;

    public Circle(double x, double y, double r) {
        super(x ,y);
        this.r = r;
    }

    public Circle(double x, double y) {
        super(x, y);
    }

    public double getR() {
        return r;
    }

    public void setR() {
        this.r = r;
    }

    public double mathArea() {
        return Math.PI * r * r;
    }

    public double mathLength() {
        return 2 * Math.PI  * r;
    }

    @Override
    public String toString() {
        return "[x = " + x + ", y = " + y + ", radius = " + r + "]";
    }
}