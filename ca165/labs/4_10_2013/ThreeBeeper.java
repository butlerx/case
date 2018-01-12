public class ThreeBeeper {
  public static void main(String[] args) {
    World home = new World();

    home.addBeeper(6, 11);

    home.addBlock(3, 7);
    home.addBlock(4, 7);
    home.addBlock(5, 7);
    home.addBlock(6, 7);
    home.addBlock(7, 7);
    home.addBlock(7, 8);
    home.addBlock(7, 9);
    home.addBlock(7, 10);
    home.addBlock(7, 11);
    home.addBlock(7, 12);
    home.addBlock(3, 8);
    home.addBlock(3, 9);
    home.addBlock(3, 10);
    home.addBlock(3, 11);
    home.addBlock(3, 12);
    home.addBlock(3, 13);
    home.addBlock(3, 14);
    home.addBlock(5, 10);
    home.addBlock(5, 9);
    home.addBlock(5, 11);
    home.addBlock(5, 12);
    home.addBlock(6, 12);

    Robot rob = new Robot();
    home.add(rob, 2, 10);
    rob.turnLeft();
    rob.turnLeft();
    rob.turnLeft();
    rob.move();
    rob.move();
    rob.move();
    rob.move();
    rob.turnLeft();
    rob.move();
    rob.move();
    rob.move();
    rob.move();
    rob.move();
    rob.move();
    rob.turnLeft();
    rob.move();
    rob.move();
    rob.move();
    rob.move();
    rob.move();
    rob.move();
    rob.move();
    rob.turnLeft();
    rob.move();
    rob.move();
    rob.move();
    rob.move();
    rob.turnLeft();
    rob.move();
    rob.move();
    rob.move();
    rob.move();
    rob.move();
    rob.turnLeft();
    rob.move();
    rob.move();
    rob.turnLeft();
    rob.move();
    rob.move();
    rob.move();
    rob.pickBeeper();
  }
}
