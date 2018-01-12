#include <iostream>
#include <vector>
using namespace std;

int partition(vector<int> v, int pivot) {
  int index = v.size();
  for (int i = 0; i < v.size(); i++) {
    if (v[i] >= v[pivot]) {
      index--;
    }
  }
  return index;
}

int main() {
  // Read in the vector
  int num;
  vector<int> v; // Create a vector of ints.
  cin &gt;
  &gt;
  num;
  while (num != -1) // Keep reading numbers until -1 entered.
  {
    v.push_back(num); // Add this number to the vector.
    cin &gt;
    &gt;
    num;
  }

  int pivot;
  cin &gt;
  &gt;
  pivot;
  cout &lt;
  &lt;
  partition(v, pivot);
  return 0;
}
