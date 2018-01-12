class Rectangle {
  int height, width;

  void get() {
    System.out.print("Enter a length and height: ");
    width = Console.readInt();
    height = Console.readInt();
  }

  int areaOf() {
    return (height * width);
  }

  boolean largerThan(Rectangle r) //true if first one is bigger
      {
    if ((height * width) > (r.height * r.width)) {
      return true;
    } else return false;
  }
}

class TestRectangle {
  public static void main(String[] args) {
    Rectangle rOne = new Rectangle();
    rOne.get();
    Rectangle rTwo = new Rectangle();
    rTwo.get();
    if (rOne.largerThan(rTwo)) {
      System.out.println("First rectangle is larger");
    } else {
      System.out.println("Second rectangle is larger");
    }
  }
}
