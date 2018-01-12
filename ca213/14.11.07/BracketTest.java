class Node<T> {
  T item; // data in node
  Node<T> next = null; // successor node

  Node(T item0, Node<T> next0) {
    item = item0;
    next = next0;
  }
}

class Stack<T> {

  private Node<T> head = null; // first node (null if empty)

  Stack() {}

  Stack(int n) {}

  boolean isEmpty() {
    return (head == null);
  }

  boolean push(T t) {
    head = new Node<>(t, head);
    return true; // always space available
  }

  T pop() {
    if (head == null) return null;
    T t = head.item;
    head = head.next;
    return t;
  }

  int size() {
    if (head == null) return 0;
    int count = 0;
    Node<T> temp = head;
    while (head != null) {
      head = head.next;
      count++;
    }
    head = temp;
    return count;
  }
}

public class BracketTest {

  static boolean isProper(String exp) {
    Stack<Character> test = new Stack<>();
    for (int i = 0; i < exp.length(); i++) {
      char c = exp.charAt(i);
      switch (c) {
        case '(':
          test.push(c);
          break;
        case ')':
          if (!('(' == test.pop())) return false;
          break;
        case '{':
          test.push(c);
          break;
        case '}':
          if (!('{' == test.pop())) return false;
          break;
        case '[':
          test.push(c);
          break;
        case ']':
          if (!('[' == test.pop())) return false;
          break;
        default:
          break;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    String test = Console.readString();
    if (isProper(test)) System.out.println("that is perfect");
    else System.out.println("that is not perfect");
  }
}
