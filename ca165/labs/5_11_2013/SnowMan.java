import graphics.*;

public class SnowMan {
  public static void main(String[] args) {
    Window win = new Window(400, 900);
    int x = 200;
    int y = 50;
    int r = 25;
    int count = 0;
    while (count <= 4) {
      Circle circle = new Circle(x, y, r);
      win.draw(circle);
      y = y + r;
      r = r + 10;
      y = y + r;
      count++;
    }
  }
}
