public class OneBeeper {
  public static void main(String[] args) {
    World space = new World();

    space.addBeeper(6, 6);
    space.addBeeper(6, 7);
    space.addBeeper(6, 8);
    space.addBeeper(7, 6);
    space.addBeeper(8, 6);
    space.addBeeper(7, 8);
    space.addBeeper(8, 7);
    space.addBeeper(8, 8);

    space.addBlock(7, 7);

    Robot bill = new Robot();
    space.add(bill);
    bill.turnLeft();
    bill.turnLeft();
    bill.move();
  }
}
