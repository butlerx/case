public class NorthBot extends Robot {
  void go() {
    if (!facingNorth()) turnLeft();
    if (!facingNorth()) turnLeft();
    if (!facingNorth()) turnLeft();
    move();
  }
}
