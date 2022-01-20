import java.util.*;

public class Game {
  private Card[] center = new Card[3];
  private Card[] visCards = new Card[3];

  private int index = 0;

  public void addCenterCard() {
    center[index++] = new Card(a, b); //method in Deck.java to get a random card
  }

  public void addFaceUp() {
    visCards[index++] = new Card(a, b);
  }

  public void printGame() {
    System.out.println("These are the current cards: ");
    System.out.println("\nCenter cards: " + center);
    System.out.println("\nFace-up Cards: " + visCards);
  }

} //end Game