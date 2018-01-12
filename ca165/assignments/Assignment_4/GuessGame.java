public class GuessGame {
  public static void main(String[] args) {
    int count = 0; //counter to count how many guesses they do
    double random = Math.random(); //generate random number
    double comNum = random * 1000; //put the random number in the range 1-1000
    int randomNum = (int) comNum; //convert the random number to an interger
    //System.out.println(randomNum); //to test the program and not randomly get the number
    System.out.print("Enter a number between 1 & 1000 (you will get ten guesses): ");
    int userNum = Console.readInt(); //user guess of the number
    count++; //add one to the counter
    while (randomNum != userNum && count != 10) // loops as long as the guess is wrong and
    {
      if (randomNum < userNum) {
        System.out.println("Lower, your guess it too high"); // tells them they guessed to high
        System.out.print("Enter a new number between 1 & 1000: ");
        userNum = Console.readInt(); //user new guess of the number
        count++; //adds one to the counter
      }
      if (randomNum > userNum) {
        System.out.println("Higher, your guess it too low"); // tells them they guessed to low
        System.out.print("Enter a new number between 1 & 1000: ");
        userNum = Console.readInt(); //user new guess of the number
        count++; //adds one to the counter
      }
    }
    if (randomNum == userNum) {
      System.out.println("You got it!"); // tells them they guessed right
      System.out.println(
          "It took you " + count + " guesses"); // prints out how many times they guessed
    } else {
      System.out.println(
          "Sorry you lose, you gussed " + count + " times already"); //tells them they lost
      System.out.println("The Number was " + randomNum); //tells them the number
    }
  }
}
// I tested the program by running it and putting in random number and seeing how what the system printed corresponded to the numbers. In testing i had the computer print out the random number it generated so i could guess numbers (i commented that out if it needs to be tested) and not randomly get it by mistake and see if what the system prints is correct in relation to the number.
