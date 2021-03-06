import java.util.*;

public class Card {
  private static String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
  private String[] suits = {"Diamonds", "Clubs", "Hearts", "Spades"};

  private short value, suit;

  //Constructor
  public Card(short value, short suit) {
    this.value = value;
    this.suit = suit;
  }

  public void setVal(short value) {
    this.value = value;
  }

  public void setSuit(short suit) {
    this.suit = suit;
  }

  public short getVal() {
    return value;
  }

  public short getSuit() {
    return suit;
  }

  public String toString() {
    return value + " of " + suit;
  }

  public String toChar(short value) {
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
        return String.valueOf(value);
    }
  } //end toChar

  public String valOfSuit(short suit) {
    switch(suit) {
      case 1:
        return "Diamonds";
      case 2:
        return "Clubs";
      case 3:
        return "Hearts";
      case 4:
        return "Spades";
      default:
        return "";
    }
  } //end charaOfSuit

  public static boolean sameCard() {

  }

  //compare rank + numbers


} //end Card
