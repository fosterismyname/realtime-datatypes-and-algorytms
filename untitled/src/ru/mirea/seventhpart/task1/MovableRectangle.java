package ru.mirea.seventhpart.task1;


public class MovableRectangle implements Movable {

    private final MovablePoint topLeft;
    private final MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public boolean isEqualsSpeed() {
        return topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed;
    }

    public String topLeftToString() {
        return String.valueOf(topLeft);
    }

    public String bottomRightToString() {
        return String.valueOf(bottomRight);
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                "topLeft = MovablePoint[x = " + topLeft.x + ", y = "+ topLeft.y+
                "], bottomRight = MovablePoint[x = " + bottomRight.x + ", y = " + bottomRight.y +
                "], xSpeed = " + topLeft.xSpeed +
                ", ySpeed = " + topLeft.ySpeed +
                "]";
    }


    @Override
    public void moveUp() {
        if (!isEqualsSpeed()) throw new IllegalStateException("Скорости точек не совпадают!");
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        if (!isEqualsSpeed()) throw new IllegalStateException("Скорости точек не совпадают!");
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        if (!isEqualsSpeed()) throw new IllegalStateException("Скорости точек не совпадают!");
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        if (!isEqualsSpeed()) throw new IllegalStateException("Скорости точек не совпадают!");
        topLeft.moveRight();
        bottomRight.moveRight();
    }

}