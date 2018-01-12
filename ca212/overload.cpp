#include <iostream>
using namespace std;

void f(int n, double m) { cout << "f(int, double)" << endl; }

void l(double n, int m) { cout << "f(double, int)" << endl; }

int main() {
  f(1, 1);
  f(1, 1.0);
  f(1.0, 1);
  f(1.0, 1.0);
}
