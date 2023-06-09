package exercise1;

/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack = 11, Queen = 12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * add your name as a modifier.
 */
public class Card {

   private String suit; //clubs, spades, diamonds, hearts
   private int value;//1-13

   public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
    
    public String getSuit() {
        return suit;
    }

    
    public void setSuit(String suit) {
        this.suit = suit;
    }

   
    public int getValue() {
        return value;
    }

    
    public void setValue(int value) {
        this.value = value;
    }  
}
