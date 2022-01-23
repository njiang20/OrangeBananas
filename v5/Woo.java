import java.util.*;
import java.io.*;

public class Woo {
  public final static int totRounds = 3;

  private boolean burn;
  private String choice;

  private InputStreamReader isr;
  private BufferedReader in;

  private Deck deck = new Deck();
  private Game game = new Game(deck);

  private Player player = new Player(deck);
  private int funds = 10000;
  private int bet;

  private Player playerAI = new Player(deck);
  private int fundsAI = 10000;
  private int betAI;

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

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
    System.out.println("This is your current hand: \n" + player.printHand());
    System.out.println(game.printCenter());

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
          player.addFaceUp();
          break;
        } else {
          System.out.println("You do not have enough funds.");
        } //end if else

      } //end while loop

      if(choice.equals("N")) {
        System.out.println("Let's start the next round!");
        game.addCenterCard();
        player.addFaceUp();
      }

      if(!(choice.equals("N")) && !(choice.equals("Y"))) {
        System.out.println("That is not a valid input.");
        game.addCenterCard();
        player.addFaceUp();
      }

    return true;

  } //end playRound

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  public boolean AIRound() {
    int i = (int)(Math.random());
    if(i == 0) { //yes
      betAI = (int)(Math.random() * fundsAI);
      fundsAI -= betAI;
      playerAI.addFaceUp();
    } else { //no
      playerAI.addFaceUp();
    }

    return true;
  } //end AIRound

  public boolean playerHand() {
    String myHand = "";
    for(int i = 0; i < 2; i++) {
      myHand += player.getHoleCards(i).toString() + "\t";
    } for(int i = 0; i < 3; i++) {
      myHand += player.getFaceUp(i).toString() + "\t";
    } for(int i = 0; i < 3; i++) {
      myHand += game.getCenterCard(i).toString() + "\t";
    }
    System.out.println("Player hand and center cards: \n" + myHand + "\n");
    System.out.println("This is your current bet: $" + bet);
    System.out.println("This is your current funds: $" + funds);
    return true;
  }

  public boolean AIHand() {
    String AIHand = "";
    for(int i = 0; i < 2; i++) {
      AIHand += playerAI.getHoleCards(i).toString() + "\t";
    } for(int i = 0; i < 3; i++) {
      AIHand += playerAI.getFaceUp(i).toString() + "\t";
    } for(int i = 0; i < 3; i++) {
      AIHand += game.getCenterCard(i).toString() + "\t";
    }
    System.out.println("AI hand and center cards: \n" + AIHand + "\n");
    System.out.println("This is the AI's bet: $" + betAI);
    System.out.println("This is the AI's funds: $" + fundsAI);
    return true;
  }


  //public static String compareHands() {

  //}

  public static void main(String[] args) {
    Woo game = new Woo();
    int rounds = 0;
    while(rounds < totRounds) {
      if(!game.playRound() || !game.AIRound())
      break;
      rounds++;
      System.out.println();
    }

    System.out.println("All the cards have been dealt! Time to compare the hands.");
    int i = 0;
    while(i < 1) {
        if(!game.playerHand() || !game.AIHand())
        break;
        i++;
        System.out.println();
    }
    //compareHands();


  //  System.out.println(playerHand());
  //  System.out.println(AIHand());

  } //end main

} //end class Woo