import java.util.*;

public class Game {
  private static ArrayList<Card> center = new ArrayList<Card>(1);
  private static ArrayList<Card> visCards = new ArrayList<Card>(1);

  public static void addCenterCard() {
    int index = 0;
    if(center.size() <= 3) {
      //center = Arrays.copyOf(center, center.size() + 1);
      //center(index++) = new Card();
      center.add(new Card());
    }
  }

  public static void addFaceUp() {
    int index = 0;
    if(visCards.size() <= 3) {
      //visCards = Arrays.copyOf(visCards, visCards.size() + 1);
      //visCards(index++) = new Card();
      visCards.add(new Card());
    }
  }

  public static Card getCenterCard(int x) {
    return center.get(x);
  }

  public static Card getFaceUp(int x) {
    return visCards.get(x);
  }

  public static String printCenter() {
    System.out.println("The game contains the following center cards: ");
    String plCenter = "";
    for(int i = 0; i < center.size(); i++) {
      plCenter += getCenterCard(i).toString();
    }
    return plCenter;
  } //end printCenter

  public static String printFaceUp() {
    System.out.println("Your hand contains the following face-up cards: ");
    String plFaceUp = "";
    for(int i = 0; i < center.size(); i++) {
      plFaceUp += getFaceUp(i).toString();
    }
    return plFaceUp;
  } //end printFaceUp

  public static void main(String[] args) {
    addCenterCard();
    addFaceUp();
    System.out.println(printCenter());
    System.out.println(printFaceUp());
  }

} //end Game
