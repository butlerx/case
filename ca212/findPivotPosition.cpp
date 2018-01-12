#include <iostream>
using namespace std;
int findPivotPosition(int *a, int size, int pivot) {
  int ans = *(a + pivot);
  int index = size;
  for (int i = 0; i < size; i++) {
    if (*(a + i) >= ans) {
      index--;
    }
  }
  return index;
}
