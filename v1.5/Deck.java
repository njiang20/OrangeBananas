public class Deck {

  public static Arraylist<Card> Deck = new Arraylist<Card>(52);

  public void Deck(){//constructor
    int i = 0;
    for (int s = 0; s < 3; s++){//for every suit

      for (int v = 0; v < 11; v++ ){//for every value
        set(v, s);
        i++;
      }
    }
  }

} //end Deck
