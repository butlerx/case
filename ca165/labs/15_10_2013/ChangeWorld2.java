public class ChangeWorld2 {
  public static void main(String[] args) {
    World Change = new World();
    ChangeBot bot = new ChangeBot();
    Change.addBeeper(0, 0);
    Change.addBeeper(0, 0);
    Change.add(bot);
    bot.findNextDirection();
  }
}
