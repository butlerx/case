class WordCount {
  public static void main(String[] args) {
    String[] sentence = new String[1000];
    System.out.println("Enter a sentence.");
    int count = 0;
    while (!Console.endOfFile()) {
      String check = Console.readToken();
      for (int i = 0; i < sentence.length; i++) {
        if (check.equals(sentence[i])) {
          i = sentence.length;
        } else {
          sentence[count] = check;
          //System.out.println(sentence[count] + " " + count);
          count++;
          i = sentence.length;
        }
      }
    }
    System.out.println(count - 1 + " distinct words.");
  }
}
