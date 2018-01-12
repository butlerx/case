public class Sweeper extends Robot {
  void move6() {
    move();
    pickBeeper();
    move();
    pickBeeper();
    move();
    pickBeeper();
    move();
    pickBeeper();
    move();
    pickBeeper();
    move();
  }

  void moveLeft() {
    turnLeft();
    move();
    turnLeft();
  }

  void moveRight() {
    turnLeft();
    turnLeft();
    turnLeft();
    move();
    turnLeft();
    turnLeft();
    turnLeft();
  }
}
