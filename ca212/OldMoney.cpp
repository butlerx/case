#include "OldMoney.h"
#include <iostream>
using namespace std;

OldMoney::OldMoney(int po, int sh, int pen) {
  int temp;
  if (pen >= 12) {
    temp = pen / 12;
    pen = pen % 12;
    sh = sh + temp;
    pennies = pen;
  } else
    pennies = pen;
  if (sh >= 20) {
    temp = sh / 20;
    sh = sh % 20;
    pound = po + temp;
    shillings = sh;
  } else
    shillings = sh;
  pounds = po;
}

int OldMoney::getTotalPennies() {
  return shillings * 12 + pennies + pounds * 240;
}
