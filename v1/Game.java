import java.util.*;

public class Game {
  private static Card[] center = new Card[3];
  private static Card[] visCards = new Card[3];

  private static int index = 0;

  public static void addCenterCard() {
    center[index++] = new Card();
  }

  public static void addFaceUp() {
    visCards[index++] = new Card();
  }

  public static Card getCenterCard(int x) {
    return center[x];
  }

  public static Card getFaceUp(int x) {
    return visCards[x];
  }

  public static void printGame() {
    System.out.println("The game contains the following center cards: ");
    for(int i = 0; i < center.length; i++) {
      System.out.println(getCenterCard(i).printCard());
    }
  } //end printGame

  public static void main(String[] args) {
    printGame();
  }

} //end Game
