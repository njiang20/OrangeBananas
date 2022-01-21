import java.util.*;

public class Card {

  private String value, suit;

  //constants
  public static final String[] values = {"Ace ", "2 ", "3 ", "4 ", "5 ", "6 ", "7 ",
  "8 ", "9 ", "10 ", "Jack ", "Queen ", "King "};
  public static final String[] suits = {"Diamonds", "Clubs", "Hearts", "Spades"};
/*
  public Card(int v, int s){//set value and suit of a given card
    this.value = values[v];
    this.suit = suits[s];
  }
*/

  //Constructor
  public Card() {
    value = getRandVal();
    suit = getRandSuit();
  }
/*
  public void setVal() {
    value = toShort(getRandVal());
  }

  public void setSuit() {
    suit = shortSuit(getRandSuit());
  }
*/
  public String getVal() {
    return value;
  }

  public String getSuit() {
    return suit;
  }

  public String getRandVal() {
    short a = (short)(Math.random() * values.length ); //random index
    return values[a];
  }

  public String getRandSuit() {
    short b = (short)(Math.random() * suits.length ); //random index
    return suits[b];
  }

  public String toString() {//override
    return value + "of " + suit;
  }

  public String printCard() {
    return getRandVal() + "of " + getRandSuit();
  }

} //end Card
