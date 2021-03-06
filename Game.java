import java.util.*;

public class Game {
  private ArrayList<Card> center = new ArrayList<Card>();

  private Deck thisDeck = new Deck();

  public Game(Deck deck) {
    thisDeck = deck;
    thisDeck.shuffle();
    addCenterCard();
  }

  public void addCenterCard() {
    if(center.size() < 3) {
      center.add(thisDeck.getDeckCard(0));
      thisDeck.removeCard(0);
    }
  } //end addCenterCard

  public Card getCenterCard(int x) { //gets the card at that index :: used in printCenter
    return center.get(x);
  }

  public String printCenter() {
    System.out.println("The game contains the following center cards: ");
    String plCenter = "";
    for(int i = 0; i < center.size(); i++) {
      plCenter += (getCenterCard(i).toString() + "\t");
    }
    return plCenter;
  } //end printCenter

/*
  public static void main(String[] args) {
    Game game = new Game(thisDeck);
    System.out.println(printGame());
  }
*/
} //end Game
