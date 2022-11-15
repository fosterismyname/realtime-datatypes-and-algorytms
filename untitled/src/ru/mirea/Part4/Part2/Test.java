package ru.mirea.Part4.Part2;

public class Test {

    public static void main(String[] args) {
        Clothes[] clothsArr = {
                new TShirt(Sizes.M, "черный", 1000),
                new TShirt(Sizes.XS, "белый", 2000),
                new Pants(Sizes.M, "красный", 500),
                new Pants(Sizes.XS, "фиолетовый", 400),
                new Skirt(Sizes.M, "белвый", 800),
                new Skirt(Sizes.S, "серый", 700),
        };


        currentDress currentTest = new currentDress();
        currentTest.dressMale(clothsArr);
        System.out.println(" ");
        currentTest.dressFemale(clothsArr);
    }
}