package ru.mirea.Part4.Part2;

public class TShirt extends Cloths  implements FemaleCloths, MaleCloths{

    TShirt(Sizes size, String color) {
        super(size, color);
    }

    TShirt(Sizes size, String color, double amount) {
        super(size, color, amount);
    }

    @Override
    public String toString() {
        return "Футболка[размер = " + getSize() + ", цвет = " + getColor() + ", стоимость = " + getAmount() + "]";
    }
}