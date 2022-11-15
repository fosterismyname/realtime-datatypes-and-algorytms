package ru.mirea.Part4.Part2;

public enum Sizes {

    XXS (36) {
        @Override
        public String getDescription() {
            return "Наименьший размер";
        }
    },
    XS (38),
    S (40),
    M (42),
    L (44);

    Sizes(int currSize) {
        euroSize = currSize;
    }

    public String getDescription() {
        return "Обычный размер";
    }

    @Override
    public String toString() {
        return name() + "(" + euroSize + ") " + getDescription();
    }

    private int euroSize;
}