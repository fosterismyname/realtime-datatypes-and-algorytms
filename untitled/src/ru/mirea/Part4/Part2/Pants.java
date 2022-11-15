package ru.mirea.Part4.Part2;

public class Pants extends Cloths implements FemaleCloths, MaleCloths{
    public Pants(Sizes size, String color) {
        super(size, color);
    }

    public Pants(Sizes size, String color, double cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "Штаны[" +
                "размер = " + getSize() +
                ", цена = " + getAmount() + " грн" +
                ", цвет = " + getColor() +
                "]";
    }
}