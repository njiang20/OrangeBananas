import java.util.*;

public class Deck {
  private ArrayList<Card> deck = new ArrayList<Card>();

  //Constructor
  public Deck() {//constructor
    for(int i = 0; i < 51; i++) {
      for (int v = 0; v < 13; v++) {//for every value
        for (int s = 0; s < 4; s++) {//for every suit
          deck.add(new Card(v, s));
        }
      }
    }
  } //end Deck

  public Card getDeckCard(int x) {
    return deck.get(x);
  }

  public void removeCard(int x) {
    deck.remove(x);
  }

  public void shuffle() {
    Collections.shuffle(deck);
  }

  public String printDeck() {//prints deck by itering
    String plDeck = "";
    for(int i = 0; i < 52; i++) {
      plDeck += (getDeckCard(i).toString() + "\t");
    }
    return plDeck;
  } //end Deck
/*
  public static void main(String[] args) {
    Deck test = new Deck();
    shuffle();
    System.out.println(printDeck());
  }
*/
} //end Deck
