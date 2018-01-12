#include <iostream>
using namespace std;

int main() {
  std::cout << "How Large is the Array : ";
  int size;
  int temp;
  std::cin >> size;
  int nums[size];
  std::cout << "Please enter " << size << " elements" << std::endl;
  for (int i = 0; i < size; i++) {
    std::cin >> temp;
    nums[i] = temp;
  }
  temp = nums[0];
  for (int i = 1; i < size; i++) {
    if (nums[i] > temp) {
      temp = nums[i];
    }
  }
  std::cout << temp << std::endl;
}
