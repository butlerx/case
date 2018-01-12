#include <iostream>
#include <vector>
using namespace std;

int aboveAverage(vector<int> v) {

  int mean = 0;
  for (int i = 0; i < v.size(); i++) {
    mean = mean + v[i];
  }
  mean = mean / v.size();
  int count = 0;
  for (int i = 0; i < v.size(); i++) {
    if (v[i] > mean) {
      count++;
    }
  }
  return count;
}

int main() {
  // Read in the vector
  int num;
  vector<int> v; // Create a vector of ints.
  cin >> num;
  while (num != -1) // Keep reading numbers until -1 entered.
  {
    v.push_back(num); // Add this number to the vector.
    cin >> num;
  }

  cout << aboveAverage(v);
  return 0;
}
