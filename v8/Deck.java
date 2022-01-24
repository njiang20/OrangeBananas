import java.util.*;

public class Deck {

  public ArrayList<Card>deck;

  public Deck() {
  //overridden constructor, makes an ArrayList named deck consisting of Cards.
  //there will be one card of every val and suit.
  deck = new ArrayList<Card>();
      for (int v = 0; v < 13; v++) {//for every value
        for (int s = 0; s < 4; s++) {//for every suit
          deck.add(new Card(v, s));
      }
    }
  }//end Deck()

  public Deck(int i){
    deck = new ArrayList<Card>(i);
  }

  public void printDeck(){
    //prints the deck
    for (int i=0; i<deck.size(); i++){
      System.out.println(deck.get(i).toString());
    }
  }

  public Card getDeckCard(int x) {
    //given int x, returns a Card at index x
    return deck.get(x);
  }

  public void removeCard(int x) {
    //given int x, removes a card at index x
    deck.remove(x);
  }

  public void shuffle() {
    //shuffles the deck
    Collections.shuffle(deck);
  }

  public String toRank(short value) {
    //given short value, returns corresponding String
    switch(value) {
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

  public short toShort(String value) {
    //given String value, returns corresponding short
    switch(value) {
      case "Jack":
        return 11;
      case "Queen":
        return 12;
      case "King":
        return 13;
      case "Ace":
        return 14;
      default:
        return Short.parseShort(value);
    }
  } //end toShort

    public void bubbleSortV() {
      for (int n = 0; n < deck.size() - 1; n++){
        //Do the following n - 1 times (where n is the number of elements in deck:

        for (int i = 0; i < deck.size() - 1; i++){
          //Iterate through the array.

          if (toShort(deck.get(i).getVal1() ) > toShort(deck.get(i+1).getVal1() ) ) {
            //If a given Comparable is greater than the Comparable after it,
            Card temp = deck.get(i);
            //swap them.
            deck.set(i, deck.get(i + 1));
            deck.set(i + 1, temp);
            }
          }
        }
      }//end bubbleSortV

      public boolean sameSuit(){
        //given a Deck, returns a boolean indicating if every Card in said Deck
        //has the same suit
        boolean ans = false;
        for (int i = 0; i < deck.size() - 1;i++){
          if (deck.get(i).getSuit1().equals(deck.get(i+1).getSuit1() ) == true){
            ans = true;
          }
        }
        return ans;
      }//close sameSuit

      public boolean isSequential(){
        //given a Deck, determines if the val of the cards in the Deck are
        //sequential
        boolean ans = false;
        int x = 0;
        bubbleSortV();

        for (int i = 0; i < deck.size() - 1; i++ ){
          //System.out.println(i);
          //System.out.println(toShort(deck.get(i).getVal1()));
          //System.out.println(toShort(deck.get(i+1).getVal1()) - 1 );

          if (toShort(deck.get(i).getVal1()) == toShort(deck.get(i+1).getVal1()) - 1 ) {
            //if a given Card's val == i

            x++;
          }
        }

        if (x == deck.size() - 1){
          ans = true;
        }

        return ans;
      }
      
      public int numSameVal(){
        //given a Deck, returns an int representing the number of Cards within the
        //deck that have the same val
        int ans = 1;
        bubbleSortV();

        return ans;
      }//close numSameVal

      public int highestCard(){
        int ans = -1;
        bubbleSortV();

        ans = toShort(deck.get( deck.size() - 1).getVal1() );
        return ans;
      }

  public static void main(String[] args) {
    Deck bob = new Deck(0);
    bob.deck.add(new Card(0, 0));
    bob.deck.add(new Card(1, 0));
    bob.deck.add(new Card(3, 0));
    bob.printDeck();
    System.out.println(bob.isSequential());
    /*
    System.out.println("=====================================================");
    shuffle();
    printDeck();
    System.out.println("=====================================================");
    bubbleSortV();
    printDeck();
    */
  }
} //end Deck
