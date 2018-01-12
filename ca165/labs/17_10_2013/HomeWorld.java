public class HomeWorld {
  public static void main(String[] args) {
    World Home = new World();
    WhileHold bot = new WhileHold();
    Home.add(bot, 10, 14);
    bot.findHome();
  }
}
