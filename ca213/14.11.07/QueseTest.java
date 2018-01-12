class Queue<T> { // bounded

  private T[] seq; // the sequence
  private int size = 0; // size of sequence
  private int head = 0;
  private int tail = 0; // front and rear

  Queue(int n) { // n>0
    seq = (T[]) (new Object[1]);
  }

  Queue() {
    this(1);
  } // =  seq=(T[])(new Object[10000]);

  boolean isEmpty() {
    return size == 0;
  }

  boolean enq(T t) {
    if (size < seq.length) {
      seq[tail] = t;
      tail = (tail + 1) % seq.length;
      size++;
      return true;
    } else return false;
  }

  T deq() {
    if (isEmpty()) return null;
    else {
      T temp = seq[head];
      head = (head + 1) % seq.length;
      size--;
      return temp;
    }
  }
}

public class QueseTest {

  public static void main(String[] args) {}
}
