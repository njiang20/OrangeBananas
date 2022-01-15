public class Deck {
  private Card[] cards = new Card[52];

  //Constructor
  public Deck() {

  }

  public static void sortDeck(ArrayList<Card> a) {
    //maxPos will point to position of SELECTION (greatest value)
    int maxPos;

    for(int pass = a.size() - 1; pass > 0; pass--) {
      maxPos = pass;

      for(int i = pass - 1; i >= 0; i--) {
        if((int)a.get(i) > (int)a.get(maxPos)) {
          maxPos = i;
        }
      }
      Card temp = q.get(pass);
      q.set(pass, q.get(maxPos));
      q.set(maxPos, temp);
    }
  }
