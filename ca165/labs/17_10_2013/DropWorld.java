public class DropWorld {
  public static void main(String[] args) {
    World Dropper = new World();
    WhileHold bot = new WhileHold();
    Dropper.add(bot);
    Dropper.addBeeper(0, 0);
    Dropper.addBeeper(0, 0);
    Dropper.addBeeper(0, 0);
    Dropper.addBeeper(0, 0);
    Dropper.addBeeper(0, 0);
    Dropper.addBeeper(0, 0);
    Dropper.addBeeper(0, 0);
    Dropper.addBeeper(0, 0);
    Dropper.addBeeper(0, 0);
    Dropper.addBeeper(0, 0);
    bot.pick();
    bot.drop();
  }
}
