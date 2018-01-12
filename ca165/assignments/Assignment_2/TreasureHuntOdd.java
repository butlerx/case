public class TreasureHuntOdd {
  public static void main(String[] args) {
    World Island = new World();
    Pirate BlackBeard = new Pirate();
    Island.add(BlackBeard);

    Island.addBeeper(6, 8);
    Island.addBeeper(6, 8);
    Island.addBeeper(6, 8);
    Island.addBeeper(6, 8);
    Island.addBeeper(6, 8);

    Island.addBeeper(6, 7);
    Island.addBeeper(6, 7);
    Island.addBeeper(6, 7);
    Island.addBeeper(6, 7);
    Island.addBeeper(6, 7);
    Island.addBeeper(6, 7);

    BlackBeard.moveNorthEight();
    BlackBeard.moveEastSix();
    BlackBeard.makeDecision();
    BlackBeard.pickUpTreasure();
  }
}
