package ru.mirea.secondpart;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Task2_9 {

    public static void main(String[] args) {

        int CardsForEach = 5;
        int players;

        String[] suits = {"Hearts", "Spades", "Diamonds", "Clubs"};
        String[] value = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        int numberOfCards = 52;

        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter -1 to stop");
            System.out.print("Number of players: ");

            if (in.hasNext()) {
                players = in.nextInt();
                if (players * CardsForEach <= numberOfCards) break;
                else {
                    if (players == -1) {
                        System.out.println("Game Over");
                        break;
                    } else System.out.println("Number of players");
                }
            }
        }


        ArrayList<String> cardsDeck = new ArrayList<String>();
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                cardsDeck.add(value[i] + " " + suits[j]);
            }
        }

        Collections.shuffle(cardsDeck);
        System.out.println(" ");

        for (int i = 0; i < players * CardsForEach; i++) {
            System.out.println(((i) % 5 + 1) + " card: " + cardsDeck.get(i));
            if (i % CardsForEach == CardsForEach - 1) {
                System.out.println("Stack #" + (i / CardsForEach + 1) + " ^");
//                System.out.println(" ");
            }
        }
    }
}