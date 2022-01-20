public class Player {
  //private Card[] holeCards = new Card[2];
  private static ArrayList<Card> holeCards = new ArrayList<Card>(2);

  public Player(Card hole1, Card hole2) {
    holeCards[0] = hole1;
    holeCards[1] = hole2;
  }

  public void printPlayerCards() {
    System.out.println("Hole cards: ");
    for(int i = 0; i < 2; i++) {
      System.out.println(holeCards[i] + "\n");
    }
  }

  public Card getCard(int num) {
    return holeCards[num];
  }

} //end Player
