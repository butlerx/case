class Tradesman extends Employee {
  private String trade;

  Tradesman(String x, String y, String z) {
    super(x, y);
    trade = z;
  }

  void put() {
    super.put();
    System.out.println("Trade :" + trade);
  }
}
