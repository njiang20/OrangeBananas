import java.util.*;

public class Player {
  //private Card[] holeCards = new Card[2];
  private static ArrayList<Card> holeCards = new ArrayList<Card>();

/*  //constructor
  public Player() {

  }
*/
  public static void addHoleCards() {
    while(holeCards.size() < 2) {
      holeCards.add(new Card());
    }
  }

  public static Card getHoleCards(int a) {
    return holeCards.get(a);
  }

  public static String printHoleCards() {
    System.out.println("Hole cards: ");
    String plHole = "";
    for(int i = 0; i < holeCards.size(); i++) {
      plHole += (getHoleCards(i).toString() + "\t\t");
    }
    return plHole;
  } //end printHoleCards

  public static void main(String[] args) {
    addHoleCards();
    System.out.println(printHoleCards());
  } //end main

} //end Player
