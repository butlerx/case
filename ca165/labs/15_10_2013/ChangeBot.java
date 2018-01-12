public class ChangeBot extends Robot {
  void pickNorth() {
    if (beeperPresent()) {
      if (!facingNorth()) {
        turnLeft();
      }
      if (!facingNorth()) {
        turnLeft();
      }
      if (!facingNorth()) {
        turnLeft();
      }
      pickBeeper();
    }
  }

  void pickSouth() {
    if (beeperPresent()) {
      if (!facingSouth()) {
        turnLeft();
      }
      if (!facingSouth()) {
        turnLeft();
      }
      if (!facingSouth()) {
        turnLeft();
      }
      pickBeeper();
    }
  }

  void findNextDirection() {
    pickNorth();
    pickSouth();
  }
}
