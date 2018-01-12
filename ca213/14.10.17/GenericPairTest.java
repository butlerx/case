class GenericPairTest {

  public static void main(String[] args) {
    Pair<String, Integer> phoneNumber = new Pair<>("Bill's number", 1324);
    System.out.println(phoneNumber);
    Pair<Double, Double> point = new Pair<>(3.14, 2.32);
    System.out.println(point);
  }
}
