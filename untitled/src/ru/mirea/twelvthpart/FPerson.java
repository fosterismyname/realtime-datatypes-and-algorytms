package ru.mirea.twelvthpart;

public class FPerson {
    private String name, surname, patronymic;

    public FPerson(String surname) {
        this.surname = surname;
    }

    public FPerson(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }
    public String getFio(){
        StringBuilder sb = new StringBuilder(surname);
        if(name != null && ! name.equals(""))
            sb.append(" ").append(name);
        if(patronymic != null && ! patronymic.equals(""))
            sb.append(" ").append(patronymic);
        return sb.toString();
    }

    public static void main(String[] args) {
        FPerson p1 = new FPerson("Буленко", "Иван", "Юрьевич");
        System.out.println(p1.getFio());
    }
}