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

} //end Card
