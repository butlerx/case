import graphics.*;

public class RobotWorld {
  public static void main(String[] args) {
    Window win = new Window(300, 300);
    int height = 20;
    int width = 20;
    int x = 0;
    int y = 0;
    Color green = new Color(0, 255, 0);
    Color white = new Color(255, 255, 255);
    int count = 0;
    int count2 = 0;
    Rectangle field = new Rectangle(0, 0, 300, 300);
    win.setForeground(green);
    win.draw(field);
    win.fill(field);
    win.setForeground(white);
    while (count < 15) {
      Line xLine = new Line(x, y, x, 300);
      win.draw(xLine);
      x = x + 20;
      count++;
    }
    x = 0;
    while (count2 < 15) {
      Line yLine = new Line(x, y, 300, y);
      win.draw(yLine);
      y = y + 20;
      count2++;
    }
  }
}
