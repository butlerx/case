import graphics.*;

public class Click {
  public static void main(String[] args) {
    Window win = new Window(400, 400);
    long start = 0;
    long stop = 0;
    while (!win.isPressed()) {
      start = System.currentTimeMillis();
    }

    while (win.isPressed()) {}
    while (!win.isPressed()) {
      stop = System.currentTimeMillis();
    }

    System.out.println("Time required was " + (stop - start) + " milliseconds.");
  }
}
