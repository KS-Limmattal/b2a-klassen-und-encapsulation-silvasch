public class MixedNumber extends Fraction {
  private int number;

  public MixedNumber(int number, int numerator, int denominator) throws ArithmeticException {
    super.setNumerator(numerator);
    super.setDenominator(denominator);
    this.number = number;
  }

  public MixedNumber(MixedNumber m) {
    this(m.number, m.getNumerator(), m.getDenominator());
  }

  public MixedNumber() {
    this(0, 0, 1);
  }

  public void add(MixedNumber m) {
    super.add(m);
    this.number += m.number;
  }

  public static MixedNumber add(MixedNumber m1, MixedNumber m2) {
    Fraction f = Fraction.add(m1, m2);
    return new MixedNumber(m1.number + m2.number, f.getNumerator(), f.getDenominator());
  }

  public void sub(MixedNumber m) {
    super.sub(m);
    this.number -= m.number;
  }

  public static MixedNumber sub(MixedNumber m1, MixedNumber m2) {
    Fraction f = Fraction.sub(m1, m2);
    return new MixedNumber(m1.number - m2.number, f.getNumerator(), f.getDenominator());
  }

  public void mul(MixedNumber m) {
    this.setNumerator(this.number * m.number + this.number * );
  }

  public boolean equals(MixedNumber m) {
    return this.getNumber() == m.getNumber() && this.getNumerator() == m.getNumerator() && this.getDenominator() == m.getDenominator();
  }

  public String toString() {
    return String.format("%d %s", this.number, super.toString());
  }

  public int getNumber() {
    return this.number;
  }

  public void setNumber(int number) {
    this.number = number;
  }
}
