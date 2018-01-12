class Time {
  private int time;

  void get() {
    System.out.print("Enter the time: ");
    time = Console.readInt();
  }

  boolean gt(Time t) {
    return (time > t.time);
  }
}
