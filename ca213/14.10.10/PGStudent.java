class PGStudent extends Student {
  private String supervisor;

  PGStudent(String name0, String programme0, String supervisor0) {
    super(name0, programme0);
    supervisor = supervisor0;
  }

  void put() { // print student details
    super.put();
    System.out.println("supervisor: " + supervisor);
  }
}
