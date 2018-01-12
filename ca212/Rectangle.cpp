#include "Rectangle.h"
#include <iostream>
using namespace std;
Rectangle::Rectangle(double w, double h) {
  height = h;
  width = w;
}
double Rectangle::getWidth() { return width; }
double Rectangle::getHeight() { return height; }
double Rectangle::getArea() { return height * width; }
