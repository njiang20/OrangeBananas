import java.util.*;

public class Card {
  public String value, suit;//A card has a value and a suit

  //Constants
  public static final String[] values = {"Ace ", "2 ", "3 ", "4 ", "5 ", "6 ", "7 ",
  "8 ", "9 ", "10 ", "Jack ", "Queen ", "King "};
  public static final String[] suits = {"Diamonds", "Clubs", "Hearts", "Spades"};

  public void set(int v, int s){//set value and suit of a given card
    this.value = values[v];
    this.suit = suits[s];
  }

  public String stringify(){//returns string version of a given card
    return (this.value + "of " + this.suit);
  }

} //end Card
