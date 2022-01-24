import java.util.*;

public class Player {
  private static ArrayList<Card> holeCards = new ArrayList<Card>();
  //holeCards are the cards that each person has
  private static ArrayList<Card> visCards = new ArrayList<Card>();
  //visCards are the cards visible to everyone

  private static Deck deck = new Deck();

  //constructor
  public Player(Deck deck) {
    this.deck = deck;
    deck.shuffle();
    addHoleCards();
    addFaceUp();
  }

  public static void addHoleCards() {
    //adds 3 hole cards and removes those 3 cards from deck
    while(holeCards.size() < 2) {
      holeCards.add(deck.getDeckCard(0));
      deck.removeCard(0);
    }
  }

  public static void addFaceUp() {
    //adds one visible card and removes that card from deck
    if(visCards.size() < 3) {
      visCards.add(deck.getDeckCard(0));
      deck.removeCard(0);
    }
  }

  public static Card getHoleCard(int a) {
    //given int a, returns the corresponding holeCard
    return holeCards.get(a);
  }

  public static Card getFaceUp(int x) {
    //given int x, returns the corresponding FaceUp card
    return visCards.get(x);
  }

  public static String strHoleCards() {
    //returns string version of all holeCards
    String plHole = "";
    for(int i = 0; i < holeCards.size(); i++) {
      plHole += (getHoleCard(i).toString() + "\t");
    }
    return "Hole cards: " + plHole;
  } //end strHoleCards

  public static String strFaceUp() {
    //returns string version of all face up cards
    String plFaceUp = "";
    for(int i = 0; i < visCards.size(); i++) {
      plFaceUp += (getFaceUp(i).toString() + "\t");
    }
    return "Face-up cards: " + plFaceUp;
  } //end strFaceUp

/*
  public static void main(String[] args) {
    Player player = new Player(deck);
    System.out.println(strHoleCards());
  }*/

} //end Player
