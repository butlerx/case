class Period {
  private Time start, end;

  void get() {
    Time start = new Time();
    Time end = new Time();
    start.get();
    end.get();
  }

  boolean overlap(Period p) {
    return (end.gt(p.start) && !start.gt(p.end));
  }

  public static void main(String[] args) {}
}
