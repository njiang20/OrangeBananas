import java.util.*;
import java.io.*;

public class Woo {
  public final static int totRounds = 3;
  private int funds;
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
    s = "--- Welcome to Texas Hold'em! ---"
    System.out.println(s);
  } //end newGame

  public boolean playRound() {
    i = 0
    //starts rounds > deal one faceup card + one card in center
    System.out.println("Hole cards: " + holeCards[i] + holeCards[i + 1]
      + "\nCenter cards: " + centerCards[i]);

    System.out.println("Would you like to place a bet now? (Y/N)");
    try {
      choice = in.readLine();
    }
    catch(IOException e) {}

    if(choice.equals("Y")) {
      System.out.println("How much would you like to bet? Current funds: " + funds);
    }
    //print funds + option to input bet <= funds
    //option to burn (boolean)
    //stops when i = totRounds

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
