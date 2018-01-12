class Bag<T extends Comparable<T>> { // generic class with T standing for a class

  private T[] bag = (T[]) (new Comparable[100]);
  private int numElements = 0; // junk in bag[numElements..]

  void add(T x) { // put x in bag
    bag[numElements] = x;
    numElements++;
  }

  int freq(T x) { // how many x�s in bag?
    int count = 0;
    for (int i = 0; i < numElements; i++)
      if (bag[i].equals(x)) // .equals because T a class
      count++;
    return count;
  }

  void remove(T x) {
    for (int i = 0; i < numElements; i++) {
      if (x.equals(bag[i])) {;
        bag[i] = bag[numElements - 1];
        numElements--;
        return;
      }
    }
  }

  int numGreater(T x) {
    int count = 0;
    for (int i = 0; i < numElements; i++) {
      if (bag[i].compareTo(x) > 0) count++;
    }
    return count;
  }
}
