public class Miner extends Robot {
  void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
  }

  void moveLeft() {
    move();
    turnLeft();
    move();
    pickBeeper();
  }

  void climb4() {
    moveLeft();
    moveRight();
    moveLeft();
    moveRight();
  }

  void fullTurn() {
    turnLeft();
    turnLeft();
  }

  void moveRight() {
    move();
    turnRight();
    move();
    pickBeeper();
  }

  void fall4() {
    moveRight();
    moveLeft();
    moveRight();
    moveLeft();
  }

  void collect1() {
    climb4();
    turnLeft();
    move();
    move();
    fullTurn();
    fall4();
    turnRight();
    move();
    move();
    fullTurn();
  }

  void collect2() {
    climb4();
    turnLeft();
    move();
    move();
    fullTurn();
    fall4();
  }
}
