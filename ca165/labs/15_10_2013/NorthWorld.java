public class NorthWorld {
  public static void main(String[] args) {
    World North = new World();
    NorthBot bot1 = new NorthBot();
    NorthBot bot2 = new NorthBot();
    NorthBot bot3 = new NorthBot();
    NorthBot bot4 = new NorthBot();
    North.add(bot1, 1, 1, "east");
    North.add(bot2, 2, 2, "west");
    North.add(bot3, 3, 3, "north");
    North.add(bot4, 4, 4, "south");
    bot1.go();
    bot2.go();
    bot3.go();
    bot4.go();
  }
}
