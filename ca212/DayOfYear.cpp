#include "DayOfYear.h"
#include <iostream>
#include <stdio.h>
using namespace std;

DayOfYear::DayOfYear() {
  month = 3;
  day = 17;
}
DayOfYear::DayOfYear(int d, int m) {
  day = d;
  month = m;
}

void DayOfYear::output() { std::cout << day << "/" << month << std::endl; }

int DayOfYear::dayNumber() {
  if (month == 0)
    return day;
  else {
    for (int i = 1; i < month; i++) {
      if (i == 9 || i == 4 || i == 6 || i == 11) {
        day = day + 30;
      } else if (i == 2) {
        day = day + 28;
      } else
        day = day + 31;
    }
  }
  return day;
}

void sellBy() {
  int num = dayNumber();
  int week = (num / 7) + 1;
  int days = num % 7;
  if (days == 0) {
    days = 7;
    week--;
  }
  printf("%02i%02i\n", week, days);
}
