package ru.mirea.Part4.Part2;

public abstract class Cloths {
    private final Sizes size;
    private final String color;
    private double amount;

    public Cloths(Sizes size, String color) {
        this.size = size;
        this.color = color;
    }

    public Cloths(Sizes size, String color, double amount) {
        this.size = size;
        this.color = color;
        this.amount = amount;
    }

    public Sizes getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public double getAmount() {
        return amount;
    }

    public void setCost(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cloths)) return false;

        Cloths currentCloths = (Cloths) o;

        if (Double.compare(currentCloths.amount, amount) != 0) return false;
        if (size != currentCloths.size) return false;
        return color.equals(currentCloths.color);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = size.hashCode();
        temp = Double.doubleToLongBits(amount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + color.hashCode();
        return result;
    }
}