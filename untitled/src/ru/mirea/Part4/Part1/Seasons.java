package ru.mirea.Part4.Part1;

public enum Seasons {

    WINTER (-10),
    SUMMER (23) {
        public String getDescription() {
            return "Warm";
        }
    },
    AUTUMN (9),
    SPRING (6);

    private final int description;

    Seasons(int description) {
        this.description = description;
    }

    public String getDescription() {
        return "Cold";
    }

    @Override
    public String toString() {
        return "[" + "Avg temp: " + description + "]";
    }
}