import graphics.*;

public class Dice {
  public static int diceRoller() {
    int dice = (int) (Math.random() * 10);
    if (dice < 1) {
      dice++;
    }
    if (dice > 6) {
      dice = dice - 4;
    }
    return dice;
  }

  public static void main(String[] args) {
    Window win = new Window(400, 400);
    Circle button = new Circle(200, 300, 40);
    //diceOnes dots
    Circle diceOneDotOne = new Circle(40, 40, 10);
    Circle diceOneDotTwo = new Circle(100, 40, 10);
    Circle diceOneDotThree = new Circle(160, 40, 10);
    Circle diceOneDotFive = new Circle(100, 100, 10);
    Circle diceOneDotSeven = new Circle(40, 160, 10);
    Circle diceOneDotEight = new Circle(100, 160, 10);
    Circle diceOneDotNine = new Circle(160, 160, 10);
    //diceTwo dots
    Circle diceTwoDotOne = new Circle(240, 40, 10);
    Circle diceTwoDotTwo = new Circle(300, 40, 10);
    Circle diceTwoDotThree = new Circle(360, 40, 10);
    Circle diceTwoDotFive = new Circle(300, 100, 10);
    Circle diceTwoDotSeven = new Circle(240, 160, 10);
    Circle diceTwoDotEight = new Circle(300, 160, 10);
    Circle diceTwoDotNine = new Circle(360, 160, 10);
    boolean run = true;
    int j = 0;
    System.out.print("Would you like to play: ");
    while (run) {
      win.draw(button);
      Color red = new Color(255, 0, 0);
      win.setForeground(red);
      win.fill(button);
      int i = 0;
      System.out.println("Press the  red button to play");
      while (!win.isPressed()) //holds the program till the mouse is clicked
      ;
      if (win.isPressed()) {
        Point mouse =
            win.getMouse(); //when the mouse is click, the computer gets the location of the mouse
        int xMouse = mouse.getX();
        int yMouse = mouse.getY();
        boolean insideTarget =
            (Math.sqrt(((xMouse - 200) * (xMouse - 200)) + ((yMouse - 300) * (yMouse - 300))))
                < 40; //checks to see if the mouse is in the circle
        if (insideTarget) {
          i++;
          j++;
          //reset the graphics
          win.erase(button);
          win.erase(diceOneDotOne);
          win.erase(diceOneDotTwo);
          win.erase(diceOneDotThree);
          win.erase(diceOneDotFive);
          win.erase(diceOneDotSeven);
          win.erase(diceOneDotEight);
          win.erase(diceOneDotNine);
          win.erase(diceTwoDotOne);
          win.erase(diceTwoDotTwo);
          win.erase(diceTwoDotThree);
          win.erase(diceTwoDotFive);
          win.erase(diceTwoDotSeven);
          win.erase(diceTwoDotEight);
          win.erase(diceTwoDotNine);
        }
      }
      while (win.isPressed()) ;
      while (i == 1) {
        int diceOne = diceRoller();
        int diceTwo = diceRoller();
        Rectangle squareOne = new Rectangle(0, 0, 200, 200);
        Rectangle squareTwo = new Rectangle(200, 0, 200, 200);
        win.draw(squareOne);
        win.draw(squareTwo);
        System.out.println("The dice are: " + diceOne + "		" + diceTwo);
        int result = diceOne + diceTwo;
        System.out.println("The total is " + result);
        //draw the dot points depending on what is rolled
        if (diceOne == 1) {
          win.draw(diceOneDotFive);
        }
        if (diceOne == 2) {
          win.draw(diceOneDotOne);
          win.draw(diceOneDotNine);
        }
        if (diceOne == 3) {
          win.draw(diceOneDotOne);
          win.draw(diceOneDotFive);
          win.draw(diceOneDotNine);
        }
        if (diceOne == 4) {
          win.draw(diceOneDotOne);
          win.draw(diceOneDotThree);
          win.draw(diceOneDotSeven);
          win.draw(diceOneDotNine);
        }
        if (diceOne == 5) {
          win.draw(diceOneDotOne);
          win.draw(diceOneDotThree);
          win.draw(diceOneDotFive);
          win.draw(diceOneDotSeven);
          win.draw(diceOneDotNine);
        }
        if (diceOne == 6) {
          win.draw(diceOneDotOne);
          win.draw(diceOneDotTwo);
          win.draw(diceOneDotThree);
          win.draw(diceOneDotSeven);
          win.draw(diceOneDotEight);
          win.draw(diceOneDotNine);
        }
        if (diceTwo == 1) {
          win.draw(diceTwoDotFive);
        }
        if (diceTwo == 2) {
          win.draw(diceTwoDotOne);
          win.draw(diceTwoDotNine);
        }
        if (diceTwo == 3) {
          win.draw(diceTwoDotOne);
          win.draw(diceTwoDotFive);
          win.draw(diceTwoDotNine);
        }
        if (diceTwo == 4) {
          win.draw(diceTwoDotOne);
          win.draw(diceTwoDotThree);
          win.draw(diceTwoDotSeven);
          win.draw(diceTwoDotNine);
        }
        if (diceTwo == 5) {
          win.draw(diceTwoDotOne);
          win.draw(diceTwoDotThree);
          win.draw(diceTwoDotFive);
          win.draw(diceTwoDotSeven);
          win.draw(diceTwoDotNine);
        }
        if (diceTwo == 6) {
          win.draw(diceTwoDotOne);
          win.draw(diceTwoDotTwo);
          win.draw(diceTwoDotThree);
          win.draw(diceTwoDotSeven);
          win.draw(diceTwoDotEight);
          win.draw(diceTwoDotNine);
        }
        //if  to draw all the dots
        if (result == 2 | result == 3 | result == 7 | result == 11 | result == 12) {
          if (result == 7) {
            System.out.println("Unfortunately, you lost.");
            System.out.println("On your " + j + " try");
            i = 0;
            run = false;
          } else {
            System.out.println("Congratulations, you won!");
            System.out.println("It took you " + j + " tries");
            i = 0;
            run = false;
          }
        } else {
          i = 0;
        }
      }
    }
  }
}
/* i wrote my code and tested all the out comes by running it till each answer came out. i then wrote methods to do parts of my code that i used multiple times.
i then tested it agin for each out come. once i had seen all out comes i wrote grachics for each out come and added a on screen graphical control.
i then ran the code to if my graphics displayed properly which they didnt. so i wrote a method to erase all graphics after each time the code is run. */
