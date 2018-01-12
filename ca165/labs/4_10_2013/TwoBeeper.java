public class TwoBeeper {
  public static void main(String[] args) {
    World home = new World();

    home.addBeeper(4, 1);

    Robot bill = new Robot();
    home.add(bill);
    bill.move();
    bill.move();
    bill.move();
    bill.move();
    bill.turnLeft();
    bill.move();
    bill.pickBeeper();
    bill.turnLeft();
    bill.move();
    bill.move();
    bill.move();
    bill.move();
    bill.turnLeft();
    bill.move();
    bill.putBeeper();
  }
}
