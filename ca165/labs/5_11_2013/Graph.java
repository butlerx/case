import graphics.*;
import java.util.*;

public class Graph {
  public static void main(String[] args) {
    Window win = new Window(400, 400);
    int xPixel;
    int yPixel;
    double y;
    double x;
    for (xPixel = 0; xPixel < 400; xPixel++) {
      x = (double) xPixel / 10;
      y = Math.sin(x);
      yPixel = (int) (y * 50 + 0.5);
      yPixel = yPixel + 200;
      Point pixel = new Point(xPixel, yPixel);

      win.draw(pixel);
    }
  }
}
