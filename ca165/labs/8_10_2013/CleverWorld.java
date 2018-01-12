public class CleverWorld {
  public static void main(String[] args) {
    World Clever = new World();
    CleverRobot bill = new CleverRobot();
    Clever.add(bill);
    bill.move5();
    bill.move5();
    bill.turnLeft();
    bill.move5();
    bill.turnAround();
    bill.move5();
    bill.turnLeft();
    bill.turnLeft();
    bill.turnLeft();
    bill.move5();
    bill.move5();
  }
}
