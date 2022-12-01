package ru.mirea.sixthpart.task2;

import ru.mirea.sixthpart.task1.Movable;
import ru.mirea.sixthpart.task1.MovablePoint;

public class MovableCircle implements Movable {

    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    public String toString() {
        return "Circle[center = (" + center.x + ", " + center.y + ") " + "\n"
                + "speed = (" + center.xSpeed + ", " + center.ySpeed + ") " + "\n"
                + "radius = " + this.radius + "]";
    }
}