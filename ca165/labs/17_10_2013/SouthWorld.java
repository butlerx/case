public class HomeWorld {
  public static void main(String[] args) {
    World Home = new World();
    WhileHold bot = new WhileHold();
    Home.add(bot);
    WhileHold bot2 = new WhileHold();
    WhileHold bot3 = new WhileHold();
    WhileHold bot4 = new WhileHold();
    Home.add(bot2, 1, 1, "north");
    Home.add(bot3, 2, 2, "west");
    Home.add(bot4, 3, 3, "south");
    bot.faceSouth();
    bot2.faceSouth();
    bot3.faceSouth();
    bot4.faceSouth();
  }
}
