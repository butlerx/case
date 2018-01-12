#include <iostream>
using namespace std;

void squareref(int &z);
int main() {
  int u;
  cin >> u;
  squareref(u);
  cout << u << endl; // Should be squared by the supplied function (supplied by
                     // ploodle)
}
