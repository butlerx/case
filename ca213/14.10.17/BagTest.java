class BagTest {

  public static void main(String[] args) {
    Bag<String> b = new Bag<String>();
    b.add("cat");
    b.add("dog");
    b.add("cat");
    System.out.println(b.freq("cat")); // see output 2
    b.remove("cat");
    System.out.println(b.freq("cat")); // see output 2
  }
}
