public class WhileHold extends Robot {
  void drop() {
    while (!beeperPresent()) {
      putBeeper();
      move();
    }
  }

  void pick() {
    while (beeperPresent()) pickBeeper();
  }

  void goToBeeper() {
    while (!beeperPresent()) move();
  }

  void faceSouth() {
    while (!facingSouth()) turnLeft();
  }

  void faceWest() {
    while (!facingWest()) turnLeft();
  }

  void drive() {
    while (frontIsClear()) move();
  }

  void findHome() {
    faceSouth();
    drive();
    faceWest();
    drive();
  }
}
