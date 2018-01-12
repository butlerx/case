public class Pirate extends Robot {
  void makeDecision() {
    while (beeperPresent()) {
      if (beeperPresent()) {
        while (!facingSouth()) turnLeft();
        pickBeeper();
      }
      if (beeperPresent()) {
        while (!facingNorth()) turnLeft();
        pickBeeper();
      }
    }
  }

  void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
  }

  void pickUpTreasure() {
    move();
    while (beeperPresent()) pickBeeper();
  }

  void moveEastSix() {
    while (!facingEast()) {
      turnRight();
    }
    move();
    move();
    move();
    move();
    move();
    move();
  }

  void moveNorthEight() {
    while (!facingNorth()) {
      turnLeft();
    }
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
  }
}
