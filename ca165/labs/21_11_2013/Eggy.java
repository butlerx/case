public class Eggy {
  public static void main(String[] args) {
    int x = 2;
    int i = 0;
    while (i == 0) {
      if (x % 2 == 1) {
        if (x % 3 == 1) {
          if (x % 4 == 1) {
            if (x % 5 == 1) {
              if (x % 6 == 1) {
                if (x % 7 == 0) {
                  i = 1;
                } else {
                  x++;
                }
              } else {
                x++;
              }
            } else {
              x++;
            }
          } else {
            x++;
          }
        } else {
          x++;
        }
      } else {
        x++;
      }
      //System.out.println("x is now: " + x);
    }
    System.out.println("Minimum number of eggs is: " + x);
  }
}
