import java.util.*;
import java.io.*;

public class Woo {
  public final static int totRounds = 3;

  private int funds = 1000;
  private int bet;
  private boolean burn;
  private String choice;

  private InputStreamReader isr;
  private BufferedReader in;

  private Deck deck = new Deck();
  private Game game = new Game(deck);
  private Player player = new Player(deck);

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
    System.out.println(player.printHoleCards() + "\n" + game.printGame());

    System.out.println("Would you like to place a bet now? (Y/N)");
    try {
      choice = in.readLine();
    }
    catch(IOException e) {}

      while(choice.equals("Y")) {
        System.out.println("How much would you like to bet? Current funds: " + funds);

        try {
          bet = Integer.parseInt(in.readLine());
        }
        catch(IOException e) {}

        if(bet <= funds) {
          funds -= bet;
          game.addCenterCard();
          game.addFaceUp();
          break;
        } else {
          System.out.println("You do not have enough funds.");
        } //end if else

      } //end while loop

      if(choice.equals("N")) {
        System.out.println("Let's start the next round!");
        game.addCenterCard();
        game.addFaceUp();
      }

      while(!(choice.equals("N")) && !(choice.equals("Y"))) {
        System.out.println("Please input either Y or N");
      }

    return true;

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
