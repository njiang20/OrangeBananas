public class Deck {
  private Card[] cards = new Card[52];

  //Constructor
  public Deck() {

  }

  public static void sortDeck() {
    for(int i = 0; i < cards.length; i++) {
      for(int j = cards.length; j > i; j--) {
        if(Card.getVal(j) < Card.getVal(j - 1)) {

        }
      }
    }

  }

  public static void bubbleSortV( ArrayList<Comparable> data )
  {
    for(int i = 0; i < data.size()-1; i++) {
      for(int j = data.size() - 1; j > i; j--){
        if((int)data.get(j) < (int)data.get(j - 1)) {
          int temp = (int)data.get(j);
          data.set(j, data.get(j - 1));
          data.set(j-1, temp);
        }
      }
    }
  }

  }
