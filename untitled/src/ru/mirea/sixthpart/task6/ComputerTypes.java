package ru.mirea.sixthpart.task6;

public enum ComputerTypes {

    ASUS (0) {
        @Override
        public String getDescription() {
            return "Самый технологичный компьютер";
        }
    },
    ACER (1),
    LENOVO (2);

    ComputerTypes(int currentIndex) {
        index = currentIndex;
    }

    public String getDescription() {
        return "Обычный компьютер";
    }

    @Override
    public String toString() {
        return name() + "(" + index + ") " + getDescription();
    }

    private int index;
}