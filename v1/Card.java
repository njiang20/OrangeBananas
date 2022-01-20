import java.util.*;

public class Card {
  private static String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
  private static String[] suits = {"Diamonds", "Clubs", "Hearts", "Spades"};

  private static short value, suit;

  //Constructor
  public Card() {
    value = toShort(getRandVal());
    suit = shortSuit(getRandSuit());
  }

/*
  public void setVal() {
    value = toShort(getRandVal());
  }

  public void setSuit() {
    suit = shortSuit(getRandSuit());
  }
*/

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

  public static short toShort(String value) {
    //converts values to numerical value (in short)
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
