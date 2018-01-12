public class DiamondField {
  public static void main(String[] args) {

    World Field = new World();

    Miner digg = new Miner();

    Field.add(digg, 6, 2, "east");
    Field.addBeeper(7, 3);
    Field.addBeeper(7, 5);
    Field.addBeeper(7, 7);
    Field.addBeeper(7, 9);
    Field.addBeeper(6, 4);
    Field.addBeeper(6, 6);
    Field.addBeeper(6, 8);
    Field.addBeeper(5, 5);
    Field.addBeeper(5, 7);
    Field.addBeeper(4, 6);
    Field.addBeeper(10, 6);
    Field.addBeeper(9, 5);
    Field.addBeeper(9, 7);
    Field.addBeeper(8, 4);
    Field.addBeeper(8, 6);
    Field.addBeeper(8, 8);

    digg.collect1();
    digg.collect2();
  }
}
