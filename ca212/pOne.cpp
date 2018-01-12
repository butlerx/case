#include <iostream>
using namespace std;

int main(int argc, char const *argv[]) {
  int v1, v2, *p1 = &v1, *p2 = &v2;
  *p1 = 5;
  *p2 = v1 + *p1;
  p1 = p2;
  *p2 = v1 + *p1;

  cout << v1 << endl;
  cout << v2 << endl;
  cout << *p1 << endl;
  cout << *p2 << endl;
  return 0;
}
