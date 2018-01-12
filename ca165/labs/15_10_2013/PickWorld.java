public class PickWorld {
  public static void main(String[] args) {
    World Pick = new World();
    Robot picker = new Robot();
    Pick.add(picker);
    Pick.addBeeper(2, 0);
    if (beeperPresent()) picker.pickBeeper();
    else picker.move();
  }
}
