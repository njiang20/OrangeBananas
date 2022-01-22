import java.util.*;

public class Game {
  private static ArrayList<Card> center = new ArrayList<Card>();
  private static ArrayList<Card> visCards = new ArrayList<Card>();

  private static Deck thisDeck  = new Deck();

  public Game(Deck deck) {
    thisDeck.shuffle();
    addCenterCard();
    addFaceUp();
  }

  public static void addCenterCard() {
    if(center.size() < 2) {
      center.add(thisDeck.getDeckCard(0));
      thisDeck.removeCard(0);
    }
  } //end addCenterCard

  public static void addFaceUp() {
    if(visCards.size() < 2) {
      visCards.add(thisDeck.getDeckCard(0));
      thisDeck.removeCard(0);
    }
  } //end addFaceUp

  public static Card getCenterCard(int x) { //gets the card at that index :: used in printCenter
    return center.get(x);
  }

  public static Card getFaceUp(int x) {
    return visCards.get(x);
  }

  public static String printCenter() {
    String plCenter = "";
    for(int i = 0; i < center.size(); i++) {
      plCenter += (getCenterCard(i).toString() + "\t");
    }
    return plCenter;
  } //end printCenter

  public static String printFaceUp() {
    String plFaceUp = "";
    for(int i = 0; i < center.size(); i++) {
      plFaceUp += (getFaceUp(i).toString() + "\t");
    }
    return plFaceUp;
  } //end printFaceUp

  public static String printGame() {
    String a = printCenter();
    String b = printFaceUp();
    return "The game contains the following center cards: " + a + "\n" + "Your hand contains the following face-up cards: " + b;
  }

  public static void main(String[] args) {
    Game game = new Game(thisDeck);
    System.out.println(printGame());
  }

} //end Game
