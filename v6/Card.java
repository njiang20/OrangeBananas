import java.util.*;

public class Card {

  private String value, suit;

  //constants
  private final static ArrayList<String> values = new ArrayList<>(Arrays.asList("Ace",
    "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"));
  private final static ArrayList<String> suits = new ArrayList<>(Arrays.asList("Diamonds",
    "Clubs", "Hearts", "Spades"));

  //Constructor
  public Card(int v, int s) {
    //constructor with 2 inputs that correspond to the indexes
    // of ArrayLists val and suits.
    value = getVal(v);
    suit = getSuit(s);
  }

  public String getVal(int x) {
    //returns the val at index x
    return values.get(x);
  }

  public String getSuit(int x) {
    //returns the suit at index x
    return suits.get(x);
  }

  public String getRandVal() {
    //getRandVal(): returns a random val
    int a = (int)(Math.random() * values.size() );
    return values.get(a);
  }

  public String getRandSuit() {
    //returns a random suit
    int b = (int)(Math.random() * suits.size() );
    return suits.get(b);
  }

  public String toString() {
    //overridden toString, returns string form of a given Card. For ex, 2 of Clubs
    return this.value + " of " + this.suit;
  }

  /*public String randCard() {//prev was printCard
    return getRandVal() + " of " + getRandSuit();
  }*/

  public String toRank(short value) {
    //takes a given short value and returns the corresponding string
    switch(value) {
      case 1:
        return "Ace";
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

  public int toInt(String value) {
    //takes a given int value and returns the corresponding int
    switch(value) {
      case "Ace":
        return 1;
      case "Jack":
        return 11;
      case "Queen":
        return 12;
      case "King":
        return 13;
      default:
        return Short.parseShort(value);
    }
  } //end toInt

} //end Card
