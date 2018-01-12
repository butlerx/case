#include <iostream>
using namespace std;

int func(char *str) {
  char *ptr = str;
  while (*ptr++)
    ;
  std::cout << "str = : " << str << ":\n";
  std::cout << "ptr = : " << ptr << ":\n";
  return ptr - str;
}
int main(int argc, char const *argv[]) {
  int x;
  std::cout << "in main\n" << std::endl;
  char greeting[] = "Hello World!";
  x = func(greeting);
  std::cout << "in main, x = " << x << std::endl;
  return 0;
}
