package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that models a "hand" of seven cards as an array and allows the user to pick a card and search for it in the hand.
 * To be used as starting code in Exercise.
 * Modified by Harjeet Singh on May 30,2023
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] hand = new Card[7];
        Random random = new Random();

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(13) + 1);
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            hand[i] = card;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of your card (1-13): ");
        int userValue = scanner.nextInt();

        System.out.print("Enter the suit of your card (1-4: Hearts, Diamonds, Spades, Clubs): ");
        int userSuit = scanner.nextInt() - 1;

        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(Card.SUITS[userSuit]);

        boolean matchFound = false;

        for (Card card : hand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
                matchFound = true;
                break;
            }
        }

        if (matchFound) {
            printInfo();
        } else {
            System.out.println("Sorry, no match found for your card.");
        }
    }

    private static void printInfo() {
        System.out.println("Congratulations, you guessed right!");
        System.out.println();

        System.out.println("My name is Harjeet Singh");
        System.out.println();

        System.out.println("My career ambitions:");
        System.out.println("-- to make a web marketing agency");

        System.out.println();

        System.out.println("My hobbies:");
        System.out.println("-- some of the several hoobies: playing outdoor/indoor games, hanging out with friends and family, cooking, gardening, etc.");

        System.out.println();
    }
}
