import java.util.*;

public class Game {
  private static Card[] center = new Card[3];
  private static Card[] visCards = new Card[3];

  private static int index = 0;

  public static void addCenterCard() {
    center[index++] = new Card(); //method in Deck.java to get a random card
  }

  public static void addFaceUp() {
    visCards[index++] = new Card();
  }

  public static void printGame() {
    System.out.println("These are the current cards: ");
    System.out.println("\nCenter cards: " + center);
    System.out.println("\nFace-up Cards: " + visCards);
  }

  public static void main(String[] args) {
    printGame();
  }

} //end Game
