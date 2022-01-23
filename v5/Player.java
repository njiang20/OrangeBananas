import java.util.*;

public class Player {
  private ArrayList<Card> holeCards = new ArrayList<Card>();
  private ArrayList<Card> visCards = new ArrayList<Card>();

  private Deck thisDeck  = new Deck();
  private Game thisGame = new Game(thisDeck);

  //constructor
  public Player(Deck deck) {
    thisDeck.shuffle();
    addHoleCards();
    addFaceUp();
  }

  public void addHoleCards() {
    while(holeCards.size() < 2) {
      holeCards.add(thisDeck.getDeckCard(0));
      thisDeck.removeCard(0);
    }
  }

  public void addFaceUp() {
    if(visCards.size() < 3) {
      visCards.add(thisDeck.getDeckCard(0));
      thisDeck.removeCard(0);
    }
  } //end addFaceUp

  public Card getHoleCards(int a) {
    return holeCards.get(a);
  }

  public Card getFaceUp(int x) {
    return visCards.get(x);
  }

  public String printHoleCards() {
    String plHole = "";
    for(int i = 0; i < holeCards.size(); i++) {
      plHole += (getHoleCards(i).toString() + "\t");
    }
    return plHole;
  } //end printHoleCards

  public String printFaceUp() {
    String plFaceUp = "";
    for(int i = 0; i < visCards.size(); i++) {
      plFaceUp += (getFaceUp(i).toString() + "\t");
    }
    return plFaceUp;
  } //end printFaceUp

  public String printHand() {
    String a = printHoleCards();
    String b = printFaceUp();
    return "Hole cards: " + a + "\n" + "Face-up cards: " + b;
  }


/*
  public static void main(String[] args) {
    Player player = new Player(thisDeck);
    System.out.println(printHoleCards());
  } //end main
*/
} //end Player