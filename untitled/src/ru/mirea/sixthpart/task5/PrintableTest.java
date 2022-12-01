package ru.mirea.sixthpart.task5;

public class PrintableTest {

    public static void main(String[] args) {
        Printable[] currArr = new Printable[5];
        currArr[0] = new Book("Книга1", "Кто-то");
        currArr[1] = new Book("Книга2", "Снова кто-то");
        currArr[2] = new Magazine("Журнал1", "Какой-то чел");
        currArr[3] = new Magazine("Журнал2", "Не знаю");
        currArr[4] = new Magazine("Журнал3", "Опять же кто-то");

        for (Printable elem : currArr) {
            elem.print();
        }

        Printable.printBooks(currArr);
        Printable.printMagazines(currArr);
    }

}