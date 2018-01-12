class Staff {
  private Employee[] staff = new Employee[1000];
  private int position = 0;

  Staff() {}

  void hire(Employee e) {
    staff[position] = e;
    position++;
  }

  void fire(Employee e) {
    int pointer = 0;
    for (int i = 0; !e.equals(staff[i]); i++) {
      if (e.equals(staff[i])) {
        staff[i] = null;
        pointer--;
      }
      pointer++;
    }
    if (pointer >= position) {
    } else {
      for (int i = pointer + 1; i < staff.length; i++) {
        staff[i] = staff[i++];
      }
    }
  }

  void put() {
    for (int i = 0; staff[i] != null; i++) {
      staff[i].put();
    }
  }
}
