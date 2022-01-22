import java.util.*;

public class Game {
  private static ArrayList<Card> center = new ArrayList<Card>();
  private static ArrayList<Card> visCards = new ArrayList<Card>();

  public static void addCenterCard() {
    if(center.size() < 2) { //< not <= or itll add a 4th card
      for (int v = 0; v < 13; v++) {//for every value
        for (int s = 0; s < 4; s++) {
          center.add(new Card(v, s));
        }
      }
    }
  } //end addCenterCard

  public static void addFaceUp() {
    if(visCards.size() < 2) {
      for (int v = 0; v < 13; v++ ){//for every value
        for (int s = 0; s < 4; s++){
          visCards.add(new Card(v, s));
        }
      }
    }
  } //end addFaceUp

  public static Card getCenterCard(int x) { //gets the card at that index :: used in printCenter
    return center.get(x);
  }

  public static Card getFaceUp(int x) {
    return visCards.get(x);
  }

  public static String printCenter() {
    System.out.println("The game contains the following center cards: ");
    String plCenter = "";
    for(int i = 0; i < 2; i++) {
      plCenter += (getCenterCard(i).toString() + "\t\t");
    }
    return plCenter;
  } //end printCenter

  public static String printFaceUp() {
    System.out.println("Your hand contains the following face-up cards: ");
    String plFaceUp = "";
    for(int i = 0; i < 2; i++) {
      plFaceUp += (getFaceUp(i).toString() + "\t\t");
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
