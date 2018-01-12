import graphics.*;

public class BullsEye {
  public static void main(String[] args) {
    Window win = new Window(400, 400);
    int x = 200;
    int y = 200;
    int r = 200;
    while (r > 20) {
      Circle circle1 = new Circle(x, y, r);
      win.draw(circle1);
      win.fill(circle1);
      r = r - 20;
      Circle circle2 = new Circle(x, y, r);
      win.draw(circle2);
      r = r - 20;
      win.clear(circle2);
    }
  }
}
