class OldMoney {

private:
  int pounds;
  int shillings;
  int pennies;

public:
  int getPounds() { return pounds; }
  int getShillings() { return shillings; }
  int getPennies() { return pennies; }
  int getTotalPennies();

  OldMoney(int po, int sh, int pen);
};
