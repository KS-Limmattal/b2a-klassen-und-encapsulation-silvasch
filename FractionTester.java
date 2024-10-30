public class FractionTester {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(3, 4);
        Fraction f2 = new Fraction();
        
        // toString():
        System.out.println(f1);
        System.out.println(f2);

        // Encapsulation, Getter und Setter:
        assert f1.getNumerator() == 3;
        assert f2.getDenominator() == 1;

        // Copy-Konstruktor und equals():
        Fraction f3 = new Fraction(f1);
        assert f1.equals(f3);
        
        // Klassen- und Instanzenmethoden:
        f3.add(f1);
        Fraction f4 = Fraction.add(f1, f2);
        assert f3.equals(new Fraction(3, 2));
        assert f4.equals(new Fraction(3, 4));

        // statische Variablen:
        assert Fraction.numberOfFractions == 6;
    }

}
