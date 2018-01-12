#include <iostream>
using namespace std;

int cube(int x) { return (x * x * x); }

int main() {
  for (int i = 1; i <= 10; i++)
    cout << i << "cubed is" << cube(i) << endl;
}
