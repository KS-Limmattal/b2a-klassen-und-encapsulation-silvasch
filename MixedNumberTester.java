public class MixedNumberTester {
  public static void main(String[] args) {
    toStringTest();
    addTest();
    subTest();
  }

  static void toStringTest() {
    MixedNumber m = new MixedNumber(2, 3, 4);
    assert m.toString().equals("2 3/4");
  }

  static void addTest() {
    MixedNumber m1 = new MixedNumber(2, 3, 4);
    MixedNumber m2 = new MixedNumber(1, 1, 2);
    assert MixedNumber.add(m1, m2).equals(new MixedNumber(3, 10, 8));
  }

  static void subTest() {
    MixedNumber m1 = new MixedNumber(2, 3, 4);
    MixedNumber m2 = new MixedNumber(1, 1, 2);
    assert MixedNumber.sub(m1, m2).equals(new MixedNumber(1, 2, 8));
  }
}
