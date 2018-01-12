public class PickBot extends Robot {
  void goPick() {
    if (beeperPresent()) {
      pickBeeper();
    } else {
      move();
    }
  }
}
