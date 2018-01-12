class Card {
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

class MyClass {

  public static void main(String[] args) {
    Card myCard = new Card();
    myCard.rank = 3;
    myCard.suit = "Hearts";
    Card yourCard = new Card();
    yourCard.rank = 3;
    yourCard.suit = "Hearts";
    Card anyCard = new Card();
    Card newCard = anyCard;
  }
}
