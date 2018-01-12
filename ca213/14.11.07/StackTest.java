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

public class StackTest {
  public static void main(String[] args) {
    Stack<Integer> test = new Stack<>();
    while (!Console.endOfFile()) {
      int temp = Console.readInt();
      test.push(temp);
    }
    int size = test.size();
    System.out.println("the stack size is " + size);
    while (!test.isEmpty()) {
      System.out.println(test.pop());
    }
  }
}
