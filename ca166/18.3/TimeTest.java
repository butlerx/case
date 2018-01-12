class Time {
  int hour, minute;

  void getTime() {
    System.out.print("Enter hour and minutes: ");
    hour = Console.readInt();
    minute = Console.readInt();
  }

  void putTime() {
    System.out.printf("%02d", hour);
    System.out.print(":");
    System.out.printf("%02d", minute);
  }

  void tick(Time t) {
    hour = t.hour;
    minute = t.minute + 1;
    if (minute >= 60) {
      minute = minute - 60;
      hour = hour + 1;
    }
  }
}

class TimeTest {
  public static void main(String[] args) {
    Time t = new Time();
    t.getTime();
    Time tPlus = new Time();
    tPlus.tick(t);
    tPlus.putTime();
    System.out.print(" is one minute after ");
    t.putTime();
  }
}
