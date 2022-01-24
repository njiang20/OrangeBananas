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

  public static Card get(int i){
    return deck.get(i);
  }

  public static void set(int i, Card card){
    deck.set(i, card);
  }

  public static int size(){
    return deck.size();
  }

  public static String toRank(short value) {
    //given short value, returns corresponding String
    switch(value) {
      case 11:
        return "Jack";
      case 12:
        return "Queen";
      case 13:
        return "King";
      default:
        return String.valueOf(value);
    }
  } //end toRank

  public static short toShort(String value) {
    //given String value, returns corresponding short
    switch(value) {
      case "Jack":
        return 11;
      case "Queen":
        return 12;
      case "King":
        return 13;
      case "Ace":
        return 14;
      default:
        return Short.parseShort(value);
    }
  } //end toShort

    public static void bubbleSortV() {
      for (int n = 0; n < deck.size() - 1; n++){
        //Do the following n - 1 times (where n is the number of elements in deck:

        for (int i = 0; i < deck.size() - 1; i++){
          //Iterate through the array.

          if (toShort(deck.get(i).getVal1() ) > toShort(deck.get(i+1).getVal1() ) ) {
            //If a given Comparable is greater than the Comparable after it,
            Card temp = deck.get(i);
            //swap them.
            deck.set(i, deck.get(i + 1));
            deck.set(i + 1, temp);
            }
          }
        }
      }//end bubbleSortV

  public static void main(String[] args) {
    Deck test = new Deck();
    printDeck();
    System.out.println("=====================================================");
    shuffle();
    printDeck();
    System.out.println("=====================================================");
    bubbleSortV();
    printDeck();
  }
} //end Deck
