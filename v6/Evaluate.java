import java.util.*;

public class Evaluate {
  private static String hand;
  private int ctr;

  public Evaluate(String hand, int ctr) {
    this.hand = hand;
    this.ctr = ctr;
    ctr = 0;
    String [] a = hand.split("\t");
    ArrayList<String> list = new ArrayList<String> (Arrays.asList(a));
    hasDouble(list, ctr);
    hasTriple(list, ctr);
  }

  public static void getResults(int ctr) {
    if(ctr == 0) {
      System.out.println("There's no combo.");
    } else if (ctr == 1) {
      System.out.println("There's a double!");
    } else {
      System.out.println("There's a triple!");
    }
  }

  public static void hasDouble(ArrayList<String> x, int ctr) {
    for(int i = 0; i < x.size(); i++) {
      for(int j = i + 1; j < x.size(); j++) {
        if(x.get(i) == x.get(j)) {
          ctr += 2;
        }
      }
    }
  } //end hasDouble

  public static void hasTriple(ArrayList<String> x, int ctr) {
    for(int i = 0; i < x.size(); i++) {
      for(int j = i + 1; j < x.size(); j++) {
        for(int k = j + 1; k < x.size(); k++) {
          if(x.get(i) == x.get(j) && x.get(i) == x.get(k)) {
            ctr += 3;
          }
        }
      }
    }
  } //end hasTriple

} //end Evaluate
