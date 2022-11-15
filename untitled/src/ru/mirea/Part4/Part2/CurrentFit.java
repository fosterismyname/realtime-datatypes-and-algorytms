package ru.mirea.Part4.Part2;

import ru.mirea.Part4.Part2.Cloths;

public class currentFit {

    public void dressMale(Cloths[] cloths) {
        System.out.println("Одежда в наличии: ");
        for (Cloths cloth: cloths) {
            if (cloths instanceof MaleCloths) System.out.println(cloths);
        }
    }

    public void dressFemale(Cloths[] cloths) {
        System.out.println("Одежда в наличии: ");
        for (Cloths cloth: cloths) {
            if (cloth instanceof FemaleCloths) System.out.println(cloth);
        }
    }

}