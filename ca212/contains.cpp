bool contains(char *name, char test) {
  while (*name != '\0') {
    if (*name == test)
      return true;
    name++;
  }
  return false;
}
