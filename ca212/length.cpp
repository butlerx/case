#include <iostream>
#include <vector>
using namespace std;

void swap(int &x, int &y) {
  int temp = y;
  y = x;
  x = temp;
}

int main() {
  int x = 5;
  int y = 7;
  swap(x, y);
  std::cout << x << std::endl;
  std::cout << y << std::endl;
}
