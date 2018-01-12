class Person {
  String forename, surname;
  char sex; // m for male. f for female
  int age;

  void getPerson() {
    forename = Console.readToken();
    surname = Console.readToken();
    sex = Console.readChar();
    age = Console.readInt();
  }

  void putPerson() { // Write name in form "Smith, Fred"
    System.out.print(surname + ", " + forename + " aged " + age + " and  ");
    if (sex == 'm') System.out.println("male");
    else System.out.println("female");
  }

  boolean isYoungMale() {
    return ((sex == 'm') && (age >= 20) && (age <= 30));
  }

  boolean isYoungFemale() {

    return ((sex == 'f') && (age >= 18) && (age <= 28));
  }

  boolean isEligible() {
    return ((isYoungMale()) || (isYoungFemale()));
  }
}

class Eligibles {
  public static void main(String[] args) {
    Person test = new Person();
    while (!Console.endOfFile()) {
      test.getPerson();
      if (test.isEligible()) {
        test.putPerson();
      }
    }
  }
}
