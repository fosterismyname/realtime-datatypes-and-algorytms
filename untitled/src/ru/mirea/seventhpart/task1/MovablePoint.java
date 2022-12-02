package ru.mirea.seventhpart.task1;

public class MovablePoint implements Movable {

    public int x;
    public int y;
    public final int xSpeed;
    public final int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "Point[" +
                "x = " + x +
                ", y = " + y +
                ", xSpeed = " + xSpeed +
                ", ySpeed = " + ySpeed +
                ']';
    }

    @Override
    public void moveUp() {
        y = y + ySpeed;
    }

    @Override
    public void moveDown() {
        y = y - ySpeed;
    }

    @Override
    public void moveRight() {
        x = x + xSpeed;
    }

    @Override
    public void moveLeft() {
        x = x - xSpeed;
    }
}