#include <iostream>
using namespace std;

int main() {
  cout << "enter three numbers: ";
  int num;
  int smallest = 0;
  for (int i = 0; i < 3; i++) {
    std::cin >> num;
    if (num < smallest) {
      smallest = num;
    }
  }
  std::cout << "The smallest number is " << smallest << std::endl;
}
