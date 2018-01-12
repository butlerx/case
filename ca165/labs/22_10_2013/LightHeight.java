public class LightHeight {
  public static void main(String[] args) {
    System.out.print("Enter your height in centimeters ");
    double height = Console.readDouble();
    double heightLight = height / 9.454272e+17;
    System.out.print("Your height is ");
    System.out.print(heightLight);
    System.out.print(" lightyears");
  }
}
