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
    value = getVal(v);
    suit = getSuit(s);
  }

  public String getVal(int x) {
    return values.get(x);
  }

  public String getSuit(int x) {
    return suits.get(x);
  }

  public String getRandVal() {
    int a = (int)(Math.random() * values.size() ); //random index
    return values.get(a);
  }

  public String getRandSuit() {
    int b = (int)(Math.random() * suits.size() ); //random index
    return suits.get(b);
  }

  public String toString() {//override
    return value + " of " + suit;
  }

  public String printCard() {
    return getRandVal() + " of " + getRandSuit();
  }

  public String toRank(short value) {
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
    //converts values to numerical value
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
