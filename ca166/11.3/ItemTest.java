class Item {
  String name;
  double price;
  int stock;

  void get() {
    System.out.print("Enter information: ");
    name = Console.readToken();
    stock = Console.readInt();
    price = Console.readDouble();
  }

  void printName() {
    System.out.print(name);
  }

  double stockValue() {
    return price * stock;
  }
}

class ItemTest {
  public static void main(String[] args) {
    Item i = new Item();
    i.get();
    while (!Console.endOfFile()) {
      Item temp = new Item();
      temp.get();
      if (temp.stockValue() > i.stockValue()) {
        i = temp;
      }
    }
    System.out.print("The item with the highest value is ");
    i.printName();
  }
}
