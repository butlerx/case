public class Card {
  int rank = 1;
  String suit = "Hearts";

  Card(int num, String cardSuit) {
    rank = num;
    suit = cardSuit;
  }

  Card() {}

  Card(int num) {
    rank = num;
  }

  Card(String cardSuit) {
    suit = cardSuit;
  }

  void cardPrint() {
    System.out.println(rank + " " + suit);
  }
}

public class BankAccount {
  double balance = 0;
  String name = "";
  String accountNumber = "";

  BankAccount(double num, String number, String user) {
    balance = num;
    name = user;
    accountNumber = number;
  }

  BankAccount() {}

  void bankPrint() {
    System.out.println("No." + accountNumber + ", " + name + ", balance: " + balance);
  }
}

public class BankLoan {
  double principal = 0;
  int duration = 0;
  double intrestRate = 0;
  String intrestType = "simple"; // true for simple, false for compound

  BankLoan(double num, int months, double rate, boolean type) {
    principal = num;
    duration = months;
    intrestRate = rate;
    if (type == True) {
      intrestType = simple;
    } else intrestType = compound;
  }

  BankLoan() {}
}
