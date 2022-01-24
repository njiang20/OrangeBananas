import java.util.*;

public class Evaluate {
  public ArrayList<Integer> banana;

  public Evaluate(){
  }

  public String highestComboStr(){
    String ans = "highestCard";
    int highest = banana.get( banana.size() - 1);
    if (highest == 9){
      ans = "royalFlush";
    }
    else if (highest == 8){
      ans = "strFlush";
    }
    else if (highest == 7){
      ans = "fourKind";
    }
    else if (highest == 6){
      ans = "fullHouse";
    }
    else if (highest == 5){
      ans = "flush";
    }
    else if (highest == 4){
      ans = "straight";
    }
    else if (highest == 3){
      ans = "threeKind";
    }
    else if (highest == 2){
      ans = "twoPair";
    }
    else if (highest == 1){
      ans = "pair";
    }

    return ans;
  }
  public int highestComboInt(){
    banana = new ArrayList<Integer>();
    Deck bob = new Deck();
    banana.add(royalFlush(bob) );
    banana.add(strFlush(bob) );
    banana.add(fourKind(bob) );
    banana.add(fullHouse(bob) );
    banana.add(flush(bob) );
    banana.add(straight(bob) );
    banana.add(threeKind(bob) );
    banana.add(twoPair(bob) );
    banana.add(pair(bob) );
    banana.add(highCard(bob) );

    Collections.sort(banana);
    return banana.get( banana.size() - 1);
  }

  public int royalFlush(Deck robert){
    int ans = 0;
    boolean condition = false;

    //check if condition is true

    if (robert.sameSuit() == true && robert.isSequential() == true){
      ans = 9;
    }
    return ans;
  }//end royalFlush

  public int strFlush(Deck bob){
    int ans = 0;
    boolean condition = false;

    //check if condition is true

    if (condition = true){
      ans = 8;
    }
    return ans;
  }//end strFlush

  public int fourKind(Deck bob){
    int ans = 0;
    boolean condition = false;

    //check if condition is true

    if (condition = true){
      ans = 7;
    }
    return ans;
  }//end fourKind

  public int fullHouse(Deck bob){
    int ans = 0;
    boolean condition = false;

    //check if condition is true

    if (condition = true){
      ans = 6;
    }
    return ans;
  }//end fullHouse

  public int flush(Deck bob){
    int ans = 0;
    boolean condition = false;

    //check if condition is true

    if (condition = true){
      ans = 5;
    }
    return ans;
  }//end flush

  public int straight(Deck bob){
    int ans = 0;
    boolean condition = false;

    //check if condition is true

    if (condition = true){
      ans = 4;
    }
    return ans;
  }//end straight

  public int threeKind(Deck bob){
    int ans = 0;
    boolean condition = false;

    //check if condition is true

    if (condition = true){
      ans = 3;
    }
    return ans;
  }//end threeKind

  public int twoPair(Deck bob){
    int ans = 0;
    boolean condition = false;

    //check if condition is true

    if (condition = true){
      ans = 2;
    }
    return ans;
  }//end

  public int pair(Deck bob){
    int ans = 0;
    boolean condition = false;

    //check if condition is true

    if (condition = true){
      ans = 1;
    }
    return ans;
  }//end

  public int highCard(Deck bob){
    //return highestCard
    int ans = 0;
    return ans;
  }//end highCard


} //end Evaluate
