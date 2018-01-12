import graphics.*;

public class ColorRectangle2 {
  public static void main(String[] args) {
    Window win = new Window(300, 355);
    int y = 50;
    int i;
    int g = 255;
    int b = 0;

    for (i = 0; i < 255; i++) {
      Line twine = new Line(100, y, 200, y);
      Color vary = new Color(b, b, b);
      win.setForeground(vary);
      win.draw(twine);
      b++;
      g--;
      y++;
    }
  }
}
