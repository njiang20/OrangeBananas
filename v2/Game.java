import java.util.*;

public class Game {
  private static ArrayList<Card> center = new ArrayList<Card>(1);
  private static ArrayList<Card> visCards = new ArrayList<Card>(1);

  public static void addCenterCard() {
    int index = 0;
    if(center.size() >= 3) {
      //center = Arrays.copyOf(center, center.size() + 1);
      //center(index++) = new Card();
      center.set(index++, new Card());
    }
  }

  public static void addFaceUp() {
    int index = 0;
    if(visCards.size() >= 3) {
      //visCards = Arrays.copyOf(visCards, visCards.size() + 1);
      //visCards(index++) = new Card();
      visCards.set(index++, new Card());
    }
  }

  public static Card getCenterCard(int x) {
    return center.get(x);
  }

  public static Card getFaceUp(int x) {
    return visCards.get(x);
  }

  public static void printCenter() {
    System.out.println("The game contains the following center cards: ");
    for(int i = 0; i < center.size(); i++) {
      System.out.println(getCenterCard(i).printCard() + "\t");
    }
  } //end printCenter

  public static void printFaceUp() {
    System.out.println("Your hand contains the following face-up cards: ");
    for(int i = 0; i < center.size(); i++) {
      System.out.println(getFaceUp(i).printCard() + "\t");
    }
  } //end printFaceUp

  public static void main(String[] args) {
    addCenterCard();
    addFaceUp();
    printFaceUp();
    printCenter();
  }

} //end Game
