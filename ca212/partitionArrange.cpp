#include <iostream>
#include <vector>
using namespace std;

void partition(vector<int> &v, int pivot) {
  int index = v.size();
  for (int i = 0; i < v.size(); i++) {
    if (v[i] >= v[pivot]) {
      index--;
    }
  }
  swap(index, pivot)
}
void swap(int index, int pivot) {
  int temp = v[index];
  v[index] = v[pivot];
  v[pivot] = temp;
}
