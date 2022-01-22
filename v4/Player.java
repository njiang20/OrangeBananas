import java.util.*;

public class Player {
  private static ArrayList<Card> holeCards = new ArrayList<Card>();
  private static Deck thisDeck  = new Deck();
  //private static Game thisGame = new Game(thisDeck);

  //constructor
  public Player(Deck deck) {
    thisDeck.shuffle();
    addHoleCards();
  }

  public static void addHoleCards() {
    while(holeCards.size() < 2) {
      holeCards.add(thisDeck.getDeckCard(0));
      thisDeck.removeCard(0);
    }
  }

  public static Card getHoleCards(int a) {
    return holeCards.get(a);
  }

  public static String printHoleCards() {
    System.out.println("Your hand has the following hole cards: ");
    String plHole = "";
    for(int i = 0; i < holeCards.size(); i++) {
      plHole += (getHoleCards(i).toString() + "\t");
    }
    return plHole;
  } //end printHoleCards

  public static void main(String[] args) {
    Player player = new Player(thisDeck);
    System.out.println(printHoleCards());
  } //end main

} //end Player
