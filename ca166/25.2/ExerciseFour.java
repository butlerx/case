public class ExerciseFour {
  public static String dayName(int d) {
    if (d == 0) {
      return "Sunday";
    } else {
      if (d == 1) {
        return "Monday";
      } else {
        if (d == 2) {
          return "Tuesday";
        } else {
          if (d == 3) {
            return "Wednesday";
          } else {
            if (d == 4) {
              return "Thursday";
            } else {
              if (d == 5) {
                return "Friday";
              } else {
                if (d == 6) {
                  return "Saturday";
                } else {
                  return "Your number is not between 0 & 6";
                }
              }
            }
          }
        }
      }
    }
  }

  public static int firstDay(int y) {
    // Day of week on which 1/1/y falls (Sunday = 0, etc.).
    return (((y - 1900) * 365 + (y - 1901) / 4 + 1) % 7);
  }

  static int daysInMonth(int m, int y) {
    if (m == 9 || m == 4 || m == 6 || m == 11) {
      return (30);
    } else {
      if (m == 2) { // catch leap year
        if (y % 4 == 0 && y != 1900) {
          return (29);
        } else return (28);
      } else return (31);
    }
  }

  public static int dayOfWeek(int d, int m, int y) {
    int daysFeb = daysInMonth(2, y);
    int dayOne = firstDay(y);
    if (m == 1) {
      return (d + dayOne - 1) % 7;
    } else {
      if (m == 2) {
        return (d + dayOne + 30) % 7;
      } else {
        if (m == 3) {
          return (d + dayOne + daysFeb + 30) % 7;
        } else {
          if (m == 4) {
            return (d + dayOne + daysFeb + 61) % 7;
          } else {
            if (m == 5) {
              return (d + dayOne + daysFeb + 91) % 7;
            } else {
              if (m == 6) {
                return (d + dayOne + daysFeb + 122) % 7;
              } else {
                if (m == 7) {
                  return (d + dayOne + daysFeb + 152) % 7;
                } else {
                  if (m == 8) {
                    return (d + dayOne + daysFeb + 183) % 7;
                  } else {
                    if (m == 9) {
                      return (d + dayOne + daysFeb + 214) % 7;
                    } else {
                      if (m == 10) {
                        return (d + dayOne + daysFeb + 244) % 7;
                      } else {
                        if (m == 11) {
                          return (d + dayOne + daysFeb + 275) % 7;
                        } else {
                          if (m == 12) {
                            return (d + dayOne + daysFeb + 305) % 7;
                          } else return 7;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  public static void main(String[] args) {
    System.out.print("Enter a date in range 1900..2099 (day month year): ");
    int d = Console.readInt();
    int m = Console.readInt();
    int y = Console.readInt();
    System.out.print(dayName(dayOfWeek(d, m, y)));
  }
}
