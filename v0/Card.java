import java.util.*;

public class Card {
  private static String[] value = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
  private static String[] suit = {"Diamonds", "Clubs", "Hearts", "Spades"};

  //Constructor
  public Card(String value, String suit) {
    this.value = value;
    this.suit = suit;
  }

  public String getVal() {
    return value;
  }

  public String getSuit() {
    return suit;
  }

  public String toString() {
    return rank + " of " + suit;
  }

}
