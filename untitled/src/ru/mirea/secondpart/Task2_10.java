package ru.mirea.secondpart;

import java.util.*;

public class Task2_10 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String s = in.nextLine();

        StringTokenizer st = new StringTokenizer(s, " ");

        int counter = 0;
        while (st.hasMoreTokens()) {
            String s1 = st.nextToken();
            counter += 1;
        }

        System.out.println("Words entered: " + counter);
    }
}