package ru.mirea.sixthpart.task4;

public class Car implements Priceable {

    private final int amount;
    private final String model;

    public Car(int amount, String model) {
        this.amount = amount;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car[model = " + model + ", price = " + amount + "]";
    }

    @Override
    public void getPrice() {
        System.out.println("Price = " + amount);
    }

}