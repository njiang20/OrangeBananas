import java.util.*;

public class Deck {
  //public Card[] cards = new Card[52];
  private static ArrayList<Card> deck = new ArrayList<Card>();

  //Constructor
  public Deck(){//constructor
    for(int i = 0; i < 51; i++) {
      for (int v = 0; v < 13; v++) {//for every value
        for (int s = 0; s < 4; s++) {//for every suit
          deck.add(new Card(v, s));
        }
      }
    }
  } //end Deck

  public static Card getDeckCard(int x) {
    return deck.get(x);
  }

  public static void removeCard(int x) {
    deck.remove(x);
  }

  public static void shuffle() {
    Collections.shuffle(deck);
  }

  public static String printDeck() {//prints deck by itering
    String plDeck = "";
    for(int i = 0; i < 52; i++) {
      plDeck += (getDeckCard(i).toString() + "\t");
    }
    return plDeck;
  } //end Deck

/*
  public static void shuffle() {
    for(int i = 0; i < 10; i++) {
      int a = (int)(Math.random() * (deck.size() + 1));
      int b = (int)(Math.random() * (deck.size() + 1));
      deck.add(a, deck.remove(b));
    }
  } //end shuffle


    int[][] track[14][1];

    public static void deckInfo() {
  	  for(int i = 0; i < 13; i++) {
  		  track[i][0] = 0;
  	  }

  	  for(int i = 0;i < 8; i++){
  		  for(int j = 0; j < 13; i++){
  				if (cards[i].equals(j)) {
  					int count = track[j][0];
  					track[j][0] = count + 1;
  				}
  		  }
  	  }
    }

    public static int[] optimalcombo(int[] a){
  	  //then just find the max count, then consider flush and straight
    }
  */

  public static void main(String[] args) {
    Deck test = new Deck();
    shuffle();
    System.out.println(printDeck());
  }

} //end Deck
