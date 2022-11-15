package ru.mirea.Part4.Part1;

public class Task4_1 {

    public static void main(String[] args) {

        for (Seasons season : Seasons.values()) {
            System.out.println(season);
        }
        System.out.println("Favorite season: ");
        getInfo(Seasons.valueOf("SUMMER"));
    }

    public static void choiceVar() {

        Seasons currentSeason = Seasons.AUTUMN;

        switch (currentSeason) {

            case WINTER -> System.out.println("I love winter");
            case SUMMER -> System.out.println("I love summer!");
            case AUTUMN -> System.out.println("I love fall!");
            case SPRING -> System.out.println("I love spring!");
            default -> System.out.println("Invalid value");

        }
    }

    public static void getInfo(Seasons season) {
        System.out.println(season.name() + " " + season);
        season.getDescription();
    }
}