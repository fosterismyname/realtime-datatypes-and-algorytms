package ru.mirea.thirdpart;

public class Task3_3 {

    public static void main(String[] args) {

        int[] mainArr = new int[4];
        for (int i = 0; i < 4; i++) {
            mainArr[i] = randomInteger(10, 99);
        }

        printArr(mainArr);
        if (checkUp(mainArr)) System.out.println("строго возрастающая");
        else System.out.println("не строго возрастающая");

    }
    public static boolean checkUp(int[] currArr) {
        for (int i = 1; i < 4; i++) {
            if (currArr[i] < currArr[i - 1]) return false;
        }
        return true;
    }

    public static void printArr(int[] currArr) {
        for (int i = 0; i < currArr.length; i++) System.out.print(currArr[i] + " ");
    }

    public static int randomInteger(int leftBorder, int rightBorder) {
        return leftBorder + (int) (Math.random() * ((rightBorder - leftBorder) + 1));
    }
}