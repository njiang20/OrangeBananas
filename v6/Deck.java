import java.util.*;

public class Deck {
  private static ArrayList<Card> deck = new ArrayList<Card>();

  public Deck() {
  //overridden constructor, makes an ArrayList named deck consisting of Cards.
  //there will be one card of every val and suit.
      for (int v = 0; v < 13; v++) {//for every value
        for (int s = 0; s < 4; s++) {//for every suit
          deck.add(new Card(v, s));
      }
    }
  }

  public static Card getDeckCard(int x) {
    //given int x, returns a Card at index x
    return deck.get(x);
  }

  public static void removeCard(int x) {
    //given int x, removes a card at index x
    deck.remove(x);
  }

  public static void shuffle() {
    //shuffles the deck
    Collections.shuffle(deck);
  }

  public static void printDeck(){
    //prints the deck
    for (int i=0; i<deck.size(); i++){
      System.out.println(deck.get(i).toString());
    }
  }

  /*public static void main(String[] args) {
    Deck test = new Deck();
    printDeck();
    System.out.println("=====================================================");
    shuffle();
    printDeck();
  }*/
} //end Deck
