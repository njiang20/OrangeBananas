import java.util.*;
import java.io.*;

public class Woo {
  public final static int totRounds = 3;

  private boolean burn;
  private String choice;
  private String choice2;

  private InputStreamReader isr;
  private BufferedReader in;

  private Deck deck = new Deck();
  private Game game = new Game();

  private Player player = new Player(deck);
  private int funds = 100000;
  private int bet;
  private int totBet;

  private Player playerAI = new Player(deck);
  private int fundsAI = 100000;
  private int betAI;
  private int totBetAI;

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
    System.out.println("This is your current hand:");
    System.out.println(player.strHoleCards());
    System.out.println(player.strFaceUp());
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
          totBet += bet;
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

      System.out.println("Would you like to burn? (Y/N)");
      try {
        choice2 = in.readLine();
      }
      catch(IOException e) {}

        if(choice2.equals("N")) {
          boolean burn = false;
        } else {
          boolean burn = true;
          System.out.println("This game is now over.");
          return false;
        }

    return true;

  } //end playRound

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  public boolean AIRound() {
    System.out.println("AI " + playerAI.strFaceUp());
    int i = (int)(Math.random());
    if(i == 0) { //yes
      betAI = (int)(Math.random() * fundsAI);
      totBetAI += betAI;
      fundsAI -= betAI;
      playerAI.addFaceUp();
    } else { //no
      playerAI.addFaceUp();
    }

    return true;
  } //end AIRound

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  public String playerHand() {
    String myHand = "";
    for(int i = 0; i < 2; i++) {
      myHand += player.getHoleCard(i).toString() + "\t";
    } for(int i = 0; i < 3; i++) {
      myHand += player.getFaceUp(i).toString() + "\t";
    } for(int i = 0; i < 3; i++) {
      myHand += game.getCenterCard(i).toString() + "\t";
    }
    return myHand;
    //System.out.println("Player hand and center cards: \n" + myHand + "\n");
    //System.out.println("This is your current bet: $" + totBet);
    //System.out.println("This is your current funds: $" + funds);
    //return true;
  }

  public String AIHand() {
    String AIHand = "";
    for(int i = 0; i < 2; i++) {
      AIHand += playerAI.getHoleCard(i).toString() + "\t";
    } for(int i = 0; i < 3; i++) {
      AIHand += playerAI.getFaceUp(i).toString() + "\t";
    } for(int i = 0; i < 3; i++) {
      AIHand += game.getCenterCard(i).toString() + "\t";
    }

    return AIHand;
    //System.out.println("AI hand and center cards: \n" + AIHand + "\n");
    //System.out.println("This is the AI's bet: $" + totBetAI);
    //System.out.println("This is the AI's funds: $" + fundsAI);
    //return true;
  }

  public boolean evaluate() {
    int counter = 0;
    Evaluate a = new Evaluate(playerHand(), counter);
    Evaluate b = new Evaluate(AIHand(), counter);

    System.out.println("Player hand and center cards: \n" + playerHand() + "\n");
    System.out.println("This is your current bet: $" + totBet);
    System.out.println("This is your current funds: $" + funds);

    System.out.println("AI hand and center cards: \n" + AIHand() + "\n");
    System.out.println("This is the AI's bet: $" + totBetAI);
    System.out.println("This is the AI's funds: $" + fundsAI);

    System.out.print("Player results: ");
    a.getResults(counter);
    System.out.print("AI results: ");
    b.getResults(counter);
    return true;
  }

  public static void main(String[] args) {
    Woo game = new Woo();
    int rounds = 0;
    while(rounds < totRounds) {
      if(!game.playRound() || !game.AIRound())
      break;
      rounds++;
      System.out.println();
      System.out.println("All the cards have been dealt! Time to compare the hands.");
    } //end while loop

    int i = 0;
    while(i < 1) {
        //if(!game.playerHand() || !game.AIHand())
      if(!game.evaluate())
      break;
      i++;
      System.out.println();
    } //end while loop

  } //end main

} //end class Woo
