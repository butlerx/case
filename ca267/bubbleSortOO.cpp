#include <ctype.h>
#include <iostream>
#include <stdio.h>
#include <stdlib.h>
using namespace std;
void fill(int *a, int size) {
  int x; // temp input used for checking
  bool zero = false;
  cout << "Enter " << size << " numbers please." << endl; // take input from
                                                          // user
  int i = 0;
  while (i <= size - 1) { // checks array isnt full
    cin >> x;
    // cout << x << endl;
    if (cin.peek() == '.') { // check for float
      cout << "Im sorry i can only take whole numbers not floats" << endl;
      cin.clear();
      cin.ignore(256, '\n');
    } else if (cin.fail()) { // checks for char or string
      cout << "I can only take numbers sorry " << endl;
      cin.clear();
      cin.ignore(256, '\n');
    } else if (x == 0 &&
               zero == false) { // check if input is zero and has it been put in
      i++;
      zero = true;
    } else {
      bool found = false;
      for (int j = 0; j < size && !found;
           j++) { // checks array to see if it already exists
        if (x == a[j]) {
          cout << "That number already exist. Please enter a new number:"
               << endl;
          cin.clear();
          cin.ignore(256, '\n');
          found = true;
        }
      }
      if (!found) {
        a[i] = x; // places in array and increments
        i++;
      }
    }
    // cout << x <<" is in postion "<< i-1<<endl ;// debug code to check input
  }
  cout << endl << "Thank you! The numbers entered are:";
  for (int i = 0; i < size; i++) {
    cout << a[i] << " ";
  }
}
void sort(int *a, int size) { // bubble sort
  for (int i = 0; i <= size - 2; i++) {
    for (int j = i + 1; j <= size - 1; j++) {
      int temp;
      if (a[i] > a[j]) {
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
      }
    }
  }
}
void printArray(int a[], int size) {
  cout << endl << "The numbers sorted are:";
  for (int i = 0; i <= size - 1; i++) {
    cout << a[i] << " ";
  }
  cout << endl;
}
int main() {
  int array[10] = {0};
  // for(int i=0;i<10;i++){cout << array[i]<< " ";}//debug code to check array
  // is initialed correctlly
  fill(array, 10);
  sort(array, 10);
  printArray(array, 10);
}
