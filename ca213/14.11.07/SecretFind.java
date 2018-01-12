public class SecretFind {

  static void findWord(String c, Secrets s) {
    if (s.has(c)) System.out.println(c);
    char temp = 'a';
    for (int i = 0; i < 26; i++) {
      if (s.hasPrefix(c)) {
        findWord(c + temp, s);
      }
      temp++;
    }
  }

  public static void main(String[] args) {
    Secrets secret = new Secrets();
    char c = 'a';
    for (int i = 0; i < 26; i++) {
      findWord(c + "", secret);
      c++;
    }
  }
}
