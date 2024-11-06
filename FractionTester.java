public class FractionTester {
    final double PI = 3.14159;
    
    public static void main(String[] args) {
        toStringTest();
        getSetTest();
        copyTest();
        addTest();
        subTest();
        simplifyTest();
    }

    static void toStringTest() {
        Fraction f = new Fraction(3, 4);
        assert f.toString().equals("3/4");
    }

    static void getSetTest() {
        Fraction f = new Fraction(3, 4);
        f.setNumerator(1);
        f.setDenominator(2);
        assert f.equals(new Fraction(1, 2));
    }

    static void copyTest() {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(f1);
        assert f1.equals(f2);
    }

    static void addTest() {
        Fraction f1 = new Fraction(2, 3);
        Fraction f2 = new Fraction(3, 4);
        assert Fraction.add(f1, f2).equals(new Fraction(17, 12));
    }

    static void subTest() {
        Fraction f1 = new Fraction(3, 4);
        Fraction f2 = new Fraction(2, 4);
        assert Fraction.sub(f1, f2).equals(new Fraction(1, 4));
    }

    static void simplifyTest() {
        Fraction f1 = new Fraction(6, 9);
        Fraction f2 = new Fraction(16, 8);

        f1.simplify();
        f2.simplify();

        assert f1.equals(new Fraction(2, 3));
        assert f2.equals(new Fraction(2, 1));
    }
}
