import java.util.*;
import java.io.*;

public class Woo {
  public final static int totRounds = 3;

  private int funds;
  private int bet;
  private boolean burn;
  private String choice;

  private InputStreamReader isr;
  private BufferedReader in;

  public Woo() {
    bet = 0;
    burn = false;
    isr = new InputStreamReader( System.in );
    in = new BufferedReader( isr );
    newGame();
  } //end constructor

  public void newGame() {
    String s;
    s = "--- Welcome to Texas Hold'em! ---";
    System.out.println(s);
  } //end newGame

  public boolean playRound() {
    //starts rounds > deal one faceup card + one card in center
    System.out.println("Hole cards: " + hole1 + hole2 + "\nCenter cards: " + center);

    System.out.println("Would you like to place a bet now? (Y/N)");
    try {
      choice = in.readLine();
    }
    catch(IOException e) {}

    if(choice.equals("Y")) {
      System.out.println("How much would you like to bet? Current funds: " + funds);
      try {
        bet = in.readLine();
      }
      catch(IOException e) {}

      funds -= bet;
    }

    addCenterCard();
    addFaceUp();

    //add new cards

  } //end playRound

  public static void main(String[] args) {
    Woo game = new Woo();
    int rounds = 0;
    while(rounds < totRounds) {
      if(!game.playRound())
      break;
      rounds++;
      System.out.println();
    }
    System.out.println("All the cards have been dealt! Time to compare the hands.");

  } //end main

} //end class Woo
