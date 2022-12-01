package ru.mirea.sixthpart.task3;

public class People implements Nameable {

    private final String firstName;
    private final String lastName;

    public People(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "People[Name = " + firstName + ", LastName = " + lastName + "]";
    }

    @Override
    public void getName() {
        System.out.println(firstName + " " + lastName);
    }

}