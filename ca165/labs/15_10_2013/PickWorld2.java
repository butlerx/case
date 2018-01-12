public class PickWorld2 {
  public static void main(String[] args) {
    World Pick = new World();
    PickBot picker = new PickBot();
    Pick.add(picker);
    Pick.addBeeper(0, 0);
    picker.goPick();
  }
}
