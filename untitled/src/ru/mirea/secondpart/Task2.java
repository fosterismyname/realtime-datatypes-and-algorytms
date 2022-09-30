package ru.mirea.secondpart;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String name, email;
        char gender;
        System.out.print("Name: ");
        name = in.nextLine();
        System.out.print("Email: ");
        email = in.nextLine();
        System.out.print("Gender: ");
        gender = in.nextLine().charAt(0);
        Author currentAuthor = new Author(name, email, gender);

        System.out.println("Author's email: " + currentAuthor.getEmail());
        System.out.println("Author's name: " + currentAuthor.getName());
        System.out.println("Author's gender: " + currentAuthor.getGender());
        currentAuthor.setEmail("orlovelisey@gmail.com");

        System.out.println("Author's email: " + currentAuthor.getEmail());
        System.out.println(currentAuthor); // Author: [name = 'Ivan', email = 'bulenko.2020@mail.ru', gender = m]
    }
}

class Author {
    private String name, email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;

        if (gender != 'm' && gender != 'f') { //  m = male, f = female
            System.out.println("Error: The gender must be 'm' or 'f'!");
            System.exit(0);
        }
        this.gender = gender;
    }

    public String getName() {
        return name;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {

        return "Author: [" + "name = '" + name +
                '\'' + ", email = '" + email +
                '\'' + ", gender = " + gender + ']';
    }
}