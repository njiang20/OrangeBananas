public class Deck {
  public static final int totCards = 52;
  private Card[] cards;

  //Constructor
  public Deck() {
    cards = new Card[totCards];
    int i = 0;
    for(int suit = )

  }

  public static void sortDeck() {
    for(int i = 0; i < cards.length; i++) {
      for(int j = cards.length; j > i; j--) {
        if(cards.getVal(j) < cards.getVal(j - 1)) {
          int temp = (int)data.getVal(j);
          cards.set(j, cards.get(j - 1));
          cards.set(j - 1, temp);
        }
      }
    }
  } //end sortDeck


} //end Deck
