import graphics.*;

public class ColorCircle {
  public static void main(String[] args) {
    Window win = new Window(300, 300);
    Circle ball = new Circle(150, 150, 50);
    win.draw(ball);
    Color red = new Color(255, 0, 0);
    Color green = new Color(0, 255, 0);
    while (true) {
      /*if the mouse is pressed and inside go green*/
      if (win.isPressed()) {
        Point mouse = win.getMouse();
        int x = mouse.getX();
        int y = mouse.getY();
        boolean outOfBall = (Math.sqrt(((x - 150) * (x - 150)) + ((y - 150) * (y - 150)))) > 50;
        if (outOfBall) {
          win.setForeground(red);
          win.fill(ball);
        } else {
          win.setForeground(green);
          win.fill(ball);
        }
      }
      /*if the mosue is pressed and outside and go red*/

    }
  }
}
