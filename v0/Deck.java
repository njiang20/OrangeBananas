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
 
  int[][] track[14][1];
  
  public static void deckInfo() {  
	  for(int i = 0; i < 13; i++) {
		  track[i][0] = 0;
	  }
	  
	  for(int i = 0;i < 8; i++){
		  for(int j = 0; j < 13; i++){
				if (cards[i].equals(j)) {
					int count = track[j][0];
					track[j][0] = count + 1;
				}
		  }
	  }
  }
  
  public static int[] optimalcombo(int[] a){
	  //then just find the max count, then consider flush and straight
  }

} //end Deck
