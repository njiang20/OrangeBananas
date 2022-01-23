import java.util.*;

public class Player {
  private ArrayList<Card> holeCards = new ArrayList<Card>();
  private ArrayList<Card> visCards = new ArrayList<Card>();

  private Deck deck = new Deck();

  //constructor
  public Player(Deck deck) {
    this.deck = deck;
    deck.shuffle();
    addHoleCards();
    addFaceUp();
  }

  public void addHoleCards() {
    while(holeCards.size() < 2) {
      holeCards.add(deck.getDeckCard(0));
      deck.removeCard(0);
    }
  }

  public void addFaceUp() {
    if(visCards.size() < 3) {
      visCards.add(deck.getDeckCard(0));
      deck.removeCard(0);
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
    return "Hole cards: " + plHole;
  } //end printHoleCards

  public String printFaceUp() {
    String plFaceUp = "";
    for(int i = 0; i < visCards.size(); i++) {
      plFaceUp += (getFaceUp(i).toString() + "\t");
    }
    return "Face-up cards: " + plFaceUp;
  } //end printFaceUp


/*
  public static void main(String[] args) {
    Player player = new Player(deck);
    System.out.println(printHoleCards());
  } //end main
*/
} //end Player
