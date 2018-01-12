public class GoWorld {
  public static void main(String[] args) {
    World Pick = new World();
    WhileHold bot = new WhileHold();
    Pick.add(bot);
    Pick.addBeeper(6, 0);
    bot.goToBeeper();
  }
}
