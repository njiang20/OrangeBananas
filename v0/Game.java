import java.util.*;

public class Game {
  private Card[] center = new Card[3];
  private Card[] visCards = new Card[3];

  private int index = 0;

  public void addCenterCard(Card card) {
    center[index++] = cards[getRandCard(1)]; //method in Deck.java to get a random card
  }

  public void addFaceUp(Card card) {
    visCards[index++] = cards[getRandCard(1)];
  }

  public void printGame() {
    System.out.println("These are the current cards: ");
    System.out.println("\nCenter cards: " + center);
    System.out.println("\nFace-up Cards: " + visCards);
  }

} //end Game
