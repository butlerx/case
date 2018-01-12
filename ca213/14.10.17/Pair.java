class Pair<T, U> {
  private T t = (T) (new Object());
  private U u = (U) (new Object());

  Pair(T t0, U u0) {
    t = t0;
    u = u0;
  }

  public String toString() {
    return (t + " " + u);
  }
}
