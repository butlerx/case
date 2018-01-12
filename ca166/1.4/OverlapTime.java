class Time {
  private int time;

  void get() {
    int time = Console.readInt();
  }

  boolean gt(Time t) { //return true if time is greater
    return time > t.time;
  }
}

class Period {
  Time start = new Time();
  Time finish = new Time();

  void get() {
    System.out.print("Enter the start time: ");
    start.get();
    System.out.print("Enter the finish time: ");
    finish.get();
  }

  boolean overlaps(Period p) {
    return (((p.start.gt(start)) && (finish.gt(p.start)))
        || ((start.gt(p.start)) && (p.finish.gt(start))));
  }
}

class OverlapTime {
  public static void main(String[] args) {
    Period pOne = new Period();
    Period pTwo = new Period();
    pOne.get();
    pTwo.get();
    if (pOne.overlaps(pTwo)) {
      System.out.println("They overlap");
    } else System.out.print("They dont overlap");
  }
}
