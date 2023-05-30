package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 * @author Gerardo Rodriguez Torres May 30, 2023 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        Card[] hand = new Card[7];
        Card cardGuess = new Card();
        int guessSuitIndex = 0;

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(rand.nextInt(13) + 1); 
            card.setSuit(Card.SUITS[rand.nextInt(4)]);
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
            hand[i] = card;
        }

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        System.out.print("Enter your guess of the value from 1 to 13 where Ace = 1, Jack = 11, Queen = 12, King = 13  ");
        cardGuess.setValue(input.nextInt());
        System.out.print("\nEnter your guess for suit where 0 = Hearts, 1 = Diamonds, 2= Spades, 3 = Clubs  ");
        guessSuitIndex = input.nextInt();
        cardGuess.setSuit(Card.SUITS[guessSuitIndex]);
        input.close();
        
        for(int i = 0; i < hand.length; i++){
            //System.out.println("Card[" + i + "] = Value = " + hand[i].getValue() + " Suit = " + hand[i].getSuit());
            if(hand[i].getValue() == cardGuess.getValue() && hand[i].getSuit().equals(cardGuess.getSuit()))
                printInfo();
        }
        
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    //I’m done!
    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Gerardo, but you can call me Yerri");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Learn different programming languages");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println("-- Pass all my courses");	

        System.out.println("My hobbies:");
        System.out.println("-- Videogames");
        System.out.println("-- Comics");
        System.out.println("-- Swimming");
        System.out.println("-- Programming");

        System.out.println();
    }

}
