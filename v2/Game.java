import java.util.*;

public class Game {
  private static ArrayList<Card> center = new ArrayList<Card>(1);
  private static ArrayList<Card> visCards = new ArrayList<Card>(1);

  public static void addCenterCard() {
    if(center.size() < 3) { //< not <= or itll add a 4th card
      center.add(new Card());
      //center = Arrays.copyOf(center, center.size() + 1);
      //center(index++) = new Card();
    }
  } //end addCenterCard

  public static void addFaceUp() {
    if(visCards.size() < 3) {
      //visCards = Arrays.copyOf(visCards, visCards.size() + 1);
      //visCards(index++) = new Card();
      visCards.add(new Card());
    }
  }

  public static Card getCenterCard(int x) { //gets the card at that index :: used in printCenter
    return center.get(x);
  }

  public static Card getFaceUp(int x) {
    return visCards.get(x);
  }

  public static String printCenter() {
    System.out.println("The game contains the following center cards: ");
    String plCenter = "";
    for(int i = 0; i < center.size(); i++) {
      plCenter += (getCenterCard(i).toString() + "\t\t");
    }
    return plCenter;
  } //end printCenter

  public static String printFaceUp() {
    System.out.println("Your hand contains the following face-up cards: ");
    String plFaceUp = "";
    for(int i = 0; i < center.size(); i++) {
      plFaceUp += (getFaceUp(i).toString() + "\t\t");
    }
    return plFaceUp;
  } //end printFaceUp

  public static void main(String[] args) {
    addCenterCard();
    addFaceUp();
    addCenterCard();
    addFaceUp();
    addCenterCard();
    addFaceUp();
    addCenterCard();
    addFaceUp();
    System.out.println(printCenter());
    System.out.println(printFaceUp());
  }

} //end Game
