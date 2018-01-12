#include <iostream>
using namespace std;

int partition(int num[], int size, int pivot) {
  int index = size;
  for (int i = 0; i < size; i++) {
    if (num[i] >= num[pivot]) {
      index--;
    }
  }
  return index;
}

int main() {
  std::cout << "How Large is the Array : ";
  int size, temp, pivot;
  std::cin >> size;
  int nums[size];
  std::cout << "Please enter " << size << " elements" << std::endl;
  for (int i = 0; i < size; i++) {
    std::cin >> temp;
    nums[i] = temp;
  }
  std::cin >> pivot;
  int index = partition(nums, size, pivot);
  std::cout << "the position of the pivot point is " << index << std::endl;
  return 0;
}
