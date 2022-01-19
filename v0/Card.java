import java.util.*;

public class Card {
  //private static String[] value = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
  //private String[] suit = {"Diamonds", "Clubs", "Hearts", "Spades"};
  private String value;
  private String suit;

  //Constructor
  public Card(String value, String suit) {
    this.value = value;
    this.suit = suit;
  }

  public String setVal(int value) {
    this.value = this.toChar(value);
  }

  public String getVal() {
    return value;
  }

  public String setSuit(int suit) {
    this.suit = suit;
  }

  public String getSuit() {
    return suit;
  }

  public String toString() {
    return rank + " of " + suit;
  }

  public String toChar(int value) {
    switch(value) {
      case 1:
        return "A";
      case 11:
        return "J";
      case 12:
        return "Q";
      case 13:
        return "K";
      default:
        return value.toString();
    }
  } //end toChar

  public int toNum() {
    switch(value) {
      case "A":
        return 1;
      case "J":
        return 11;
      case "Q":
        return 12;
      case "K":
        return 13;
      default:
        return Integer.parseInt(value);
    }
  }

}
