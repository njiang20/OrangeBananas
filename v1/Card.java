import java.util.*;

public class Card {
  private static String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
  private static String[] suits = {"Diamonds", "Clubs", "Hearts", "Spades"};

  private static short value, suit;

  //Constructor
  public Card(short value, short suit) {
    this.value = toShort(getRandVal());
    this.suit = shortSuit(getRandSuit());
  }

  public void setVal(short value) {
    this.value = toShort(getRandVal());
  }

  public void setSuit(short suit) {
    this.suit = shortSuit(getRandSuit());
  }

  public short getVal() {
    return value;
  }

  public short getSuit() {
    return suit;
  }

  public static String getRandVal() {
    short a = (short)(Math.random() * (values.length - 1)); //random index
    return values[a];
  }

  public static String getRandSuit() {
    short b = (short)(Math.random() * (suits.length - 1)); //random index
    return suits[b];
  }

  public String toRank(short value) {
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
  } //end toRank

  public static short toShort(String value) {
    //converts values to numerical value (in short)
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
        return Short.parseShort(value);
    }
  } //end toShort

  public static short shortSuit(String suit) {
    //converts suits to a numerical equivalent (in short)
    switch(suit) {
      case "Diamonds":
        return 1;
      case "Clubs":
        return 2;
      case "Hearts":
        return 3;
      case "Spades":
        return 4;
      default:
        return -1;
    }
  } //end charaOfSuit

  public String toString() {
    return value + " of " + suit;
  }

  public static String printCard() {
    return values[toShort(getRandVal())] + " of " + suits[shortSuit(getRandSuit())];
  }

  //compare rank + numbers
  public static void main(String[] args) {
    System.out.println(getRandVal());
    System.out.println(getRandSuit());
    System.out.println(printCard());
  }


} //end Card
