import java.util.*;

public class Evaluate {
  private static ArrayList<Card> deck = new ArrayList<Card>();

    public static void printDeck(){
      //prints the deck
      for (int i=0; i<deck.size(); i++){
        System.out.println(deck.get(i).toString());
      }
    }//end printDeck

    public static void shuffle() {
      //shuffles the deck
      Collections.shuffle(deck);
    }

  public int royalFlush(Deck bob){
    return -1;
  }//end royalFlush

  public int strFlush(Deck bob){
    return -1;
  }//end strFlush

  public int fourKind(Deck bob){
    return -1;
  }//end fourKind

  public int fullHouse(Deck bob){
    return -1;
  }//end fullHouse

  public int flush(Deck bob){
    return -1;
  }//end flush

  public int straight(Deck bob){
    return -1;
  }//end straight

  public int threeKind(Deck bob){
    return -1;
  }//end threeKind

  public int twoPair(Deck bob){
    return -1;
  }//end

  public int pair(Deck bob){
    return -1;
  }//end

  public int highCard(Deck bob){
    return -1;
  }//end

  public static void main(String[] args) {
    Deck deck = new Deck();
    printDeck();
    System.out.println("=====================================================");
    shuffle();
    printDeck();
    System.out.println("=====================================================");
    bubbleSortV(deck);
    printDeck();
  }

} //end Evaluate
