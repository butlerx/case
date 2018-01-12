#include <iostream>
#include <vector>
using namespace std;

void arrange(vector<int> &v, int pivot) {
  int index = v.size();
  for (int i = 0; i < v.size(); i++) {
    if (v[i] >= v[pivot]) {
      index--;
    }
  }
  int temp = v[index];
  v[index] = v[pivot];
  v[pivot] = temp;
}
