package ru.mirea.Part4.Part2;


public class Skirt extends Cloths implements FemaleCloths {
    public Skirt(Sizes size, String color) {
        super(size, color);
    }

    public Skirt(Sizes size, String color, double amount) {
        super(size, color, amount);
    }

    @Override
    public String toString() {
        return "Юбка[размер = " + getSize() + ", цвет = " + getColor() + ", стоимость = " + getAmount() + "]";
    }
}