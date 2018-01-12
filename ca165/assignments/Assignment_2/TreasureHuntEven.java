public class TreasureHuntEven {
  public static void main(String[] args) {
    World Island = new World();
    Pirate BlackBeard = new Pirate();
    Island.add(BlackBeard);

    Island.addBeeper(6, 8);
    Island.addBeeper(6, 8);
    Island.addBeeper(6, 8);
    Island.addBeeper(6, 8);
    Island.addBeeper(6, 8);
    Island.addBeeper(6, 8);

    Island.addBeeper(6, 9);
    Island.addBeeper(6, 9);
    Island.addBeeper(6, 9);
    Island.addBeeper(6, 9);
    Island.addBeeper(6, 9);
    Island.addBeeper(6, 9);

    BlackBeard.moveNorthEight();
    BlackBeard.moveEastSix();
    BlackBeard.makeDecision();
    BlackBeard.pickUpTreasure();
  }
}
