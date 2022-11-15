package ru.mirea.thirdpart.Task3_2;

class Point {

    double x = 0.0;
    double y = 0.0;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getXofPoint() {
        return x;
    }

    public double getYofPoint() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "[x = " + x + ", y = " + y + "]";
    }

}