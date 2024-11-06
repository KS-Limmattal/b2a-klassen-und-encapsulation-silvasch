public class Fraction {
    static int numberOfFractions;
    private int numerator, denominator;

    public Fraction(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero");
        }
        
        this.numerator = numerator;
        this.denominator = denominator;
        numberOfFractions++;
    }
    
    public Fraction(Fraction f) {
        this(f.numerator, f.denominator);
    }

    public Fraction() {
        this(0, 1);
    }

    public void add(Fraction f) {
        this.setNumerator(this.numerator * f.denominator + this.denominator * f.numerator);
        this.setDenominator(this.denominator * f.denominator);
    }

    public static Fraction add(Fraction f1, Fraction f2) {
        return new Fraction(f1.numerator * f2.denominator + f1.denominator * f2.numerator, f1.denominator * f2.denominator);
    }

    public void sub(Fraction f) {
        f.setNumerator(f.getNumerator() * -1);   
        this.add(f);
    }

    public static Fraction sub(Fraction f1, Fraction f2) {
        f2.setNumerator(f2.getNumerator() * -1);
        return Fraction.add(f1, f2);
    }
   
    public boolean equals(Fraction f) {
        return this.numerator * f.denominator == this.denominator * f.numerator;
    }

    public void simplify() {
        int gcd = gcd();
        this.numerator /= gcd;
        this.denominator /= gcd;
    }

    public int gcd() {
        int smallerNumber = 0;
        if (this.numerator < this.denominator) {
            smallerNumber = this.numerator;
        } else {
            smallerNumber = this.denominator;
        }

        for (int i = smallerNumber; i > 1; i--) {
            if (this.numerator % i == 0 && this.denominator % i == 0) {
                return i;
            }
        }

        return 1;
    }

    public String toString() {
        return String.format("%d/%d", this.numerator, this.denominator);
    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero");
        } else {
            this.denominator = denominator;
        }
    }

}
