void reverse(int a[], int len) {
  for (int i = 0; i < len / 2; i++) {
    int temp = a[i];
    a[i] = a[len - i - 1];
    a[len - i - 1] = temp;
  }
}

void reverseS(int i, int len) {
  *i = *len;
  if (i == len)
    return;
  reverseS(i++, len--);
}
