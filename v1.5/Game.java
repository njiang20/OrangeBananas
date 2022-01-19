public class Game {
  private Card[] center = new Card[3];
  private Card[] visCards = new Card[3];

  private int index = 0;

  public void addCenterCard(Card card) {
    this.center[index++] = card;
  }

  public void addFaceUp(Card card) {
    this.visCards[index++] = card;
  }

  public void printGame() {
    System.out.println("These are the current cards: ");
    System.out.println("\nCenter cards: " + center);
    System.out.println("\nFace-up Cards: " + visCards);
  }

} //end Game
