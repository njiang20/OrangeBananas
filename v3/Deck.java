import java.util.*;

public class Deck {
  //public Card[] cards = new Card[52];
  private static ArrayList<Card> Deck = new ArrayList<Card>(52);

  //Constructor
  public Deck(){//constructor
    int i = 0;
    for (int s = 0; s < 3; s++){//for every suit

      for (int v = 0; v < 11; v++ ){//for every value
        Deck.get(i).setCard(v, s);
        i++;
      }
    }
  }

  public static void printDeck() {//prints deck by itering
    for(int i = 0; i < Deck.size(); i++) {
      System.out.println(Deck.get(i));
    }
  } //end Deck
/*
  public Deck() {
    int i = 0;
    for(short a = 0; a < 4; a++) {
      for(short b = 0; b < 13; b++) {
        Deck[i++] = new Card();
      }
    }
  }
*/


/*
  public void sortDeck() {
    for(int i = 0; i < cards.length; i++) {
      for(int j = cards.length; j > i; j--) {
        if(cards.getVal(j) < cards.getVal(j - 1)) {
          int temp = (int)cards.getVal(j);
          cards.set(j, cards.get(j - 1));
          cards.set(j - 1, temp);
        }
      }
    }
  } //end sortDeck

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
  Deck bob = new Deck();
  printDeck();
}
} //end Deck
