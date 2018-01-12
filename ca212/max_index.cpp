#include <iostream>
using namespace std;

int max_index(int num[], int size) {
  int temp = num[0];
  int position = 0;
  for (int i = 1; i < size; i++) {
    if (num[i] > temp) {
      temp = num[i];
      position = i;
    }
  }
  return position;
}

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
  int index = max_index(nums, size);
  std::cout << "The Largest elements index position is " << index << std::endl;
  return 0;
}
