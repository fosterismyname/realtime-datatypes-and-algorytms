package ru.mirea.eighteenthpart;

public class Throws2 {
    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }

    public String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        Throws2 throwsDemo = new Throws2();
        try {
            throwsDemo.printMessage("exc");
            throwsDemo.printMessage(null);
        } catch (NullPointerException exception) {
            System.out.println("error");
        }
    }
}