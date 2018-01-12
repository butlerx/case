import graphics.*;

public class CircleReact {
  public static void main(String[] args) {
    Window win = new Window(1080, 640);
    long timeBest =
        1000000; //used a large number to initialise it because in testing i needed it initialised to keep track on best score and when i tested the program i never had a time this large
    while (true) //loop forever
    {
      int x = (int) (Math.random() * 1000); //random x postion for circle
      int y = (int) (Math.random() * 1000); //random y postion for circle
      if (y > 640) //make sure the target is on screen
      y = y - 360;
      Circle target = new Circle(x, y, 10); //target to click in
      long start;
      long stop;
      long time;
      win.draw(target); //draws the circle to click in
      win.fill(target);
      start = System.currentTimeMillis(); //starts the timer
      while (!win.isPressed()) //holds the program till the mouse is clicked
      ;
      if (win.isPressed()) {
        Point mouse =
            win.getMouse(); //when the mouse is click, the computer gets the location of the mouse
        int xMouse = mouse.getX();
        int yMouse = mouse.getY();
        boolean insideTarget =
            (Math.sqrt(((xMouse - x) * (xMouse - x)) + ((yMouse - y) * (yMouse - y))))
                < 10; //checks to see if the mouse is in the circle
        if (insideTarget) //if it's in the circle, it stops the clock, erases the circle and tells the user how long it took
        {
          stop = System.currentTimeMillis();
          win.erase(target);
          win.clear(target);
          System.out.println("Your reaction time was " + (stop - start) + " milliseconds.");
          time = stop - start;
          if (timeBest < time) //checks to see if the user beat their best score
          ;
          else //if they did it stores the time as their best and tells them it was their best
          {
            timeBest = time;
            System.out.println("You just beat your personal best.");
          }
        } else // if they missed the circle it erases the circle and tells them they missed it
        {
          win.erase(target);
          win.clear(target);
          System.out.println("You missed the circle.");
        }
        while (win
            .isPressed()) //this is to stop the computer createing multiple times for the user and force it to wait till the user releases the mouse click
        ;
      }
    }
  }
}
/* i used empty while loops to hold the program because in testing if i did not hold it i would end up drawing circles on top of one another and not erasing them.
I would also end giving the user multiple time as it would keep printing till the user let go of the mouse */
