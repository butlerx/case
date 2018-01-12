public class Card {
  int rank = 1;
  String suit = "Hearts";

  Card(int num, String cardSuit) {
    rank = num;
    suit = cardSuit;
  }

  Card() {}

  void cardPrint() {
    System.out.println(rank + " " + suit);
  }
}

public class ExerciseThree {
  public static void main(String[] args) {
    Card card1 = new Card(3, "Clubs");
    Card card2 = new Card(); //initialised to 1 of Hearts by default
    card1.cardPrint();
    card2.cardPrint();
  }
}
