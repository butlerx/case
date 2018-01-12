import graphics.*;

public class ColorLine {
  public static void main(String[] args) {
    Window win = new Window(300, 255);
    int y = 0;
    int i;
    int r = 255;
    int b = 0;

    for (i = 0; i < 255; i++) {
      Point dot = new Point(150, y);
      Color vary = new Color(r, 0, b);
      win.setForeground(vary);
      win.draw(dot);
      b++;
      r--;
      y++;
    }
  }
}
