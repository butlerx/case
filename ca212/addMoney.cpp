#include "OldMoney.h"
#include <iostream>
using namespace std;

OldMoney add(OldMoney a1, OldMoney a2) {
  return OldMoney(a1.pounds + a2.pounds, a1.shillings + a2.shillings,
                  a1.pennies + a2.pennies);
}
