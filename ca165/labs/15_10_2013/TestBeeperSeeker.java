public class TestBeeperSeeker {
  public static void main(String[] args) {
    World testBeeps = new World();

    testBeeps.addBeeper(2, 9);
    testBeeps.addBeeper(2, 7);

    BeeperSeeker1 b1 = new BeeperSeeker1();
    BeeperSeeker3 b3 = new BeeperSeeker3();

    testBeeps.add(b1, 2, 9, "east");
    testBeeps.add(b3, 2, 7, "east");

    b1.go();

    b3.go();
  }
}
