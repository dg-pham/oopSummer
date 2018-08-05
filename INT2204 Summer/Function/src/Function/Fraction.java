/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Function;

/**
 *
 * @author Go Eun Sung
 */
public class Fraction {

    private int numerator, denominator;

    //getter & setter
    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    //constructor to get a fraction
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    //constructor to get method
    public Fraction(Fraction fractionA, Fraction fractionB, String calculation) {
        switch (calculation) {
            case "+":
                this.add(fractionA, fractionB);
                break;

            case "-":
                this.subtract(fractionA, fractionB);
                break;

            case "x":
            case "*":
            case ".":
                this.multiply(fractionA, fractionB);
                break;

            case "/":
            case ":":
                this.divide(fractionA, fractionB);
                break;
            default:
                System.out.println("Please retype!");
        }
    }

    //get GCD
    private int GCD(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        if (a >= b) {
            return GCD(b, a - b);
        } else {
            return GCD(b - a, a);
        }
    }

    //normalize fraction
    public boolean isNormalized() {
        return GCD(this.getNumerator(), this.getDenominator()) == 1;
    }

    public void nomalize() {
        int gcd = GCD(this.getNumerator(), this.getDenominator());
        if (!this.isNormalized()) {
            this.setNumerator(this.getNumerator() / gcd);
            this.setDenominator(this.getDenominator() / gcd);
        }
    }

    //fraction condition
    public String print() {
        if (this.getDenominator() == 0) {
            return "Math Error";
        } else {
            if (this.getNumerator() == 0) {
                return "0";
            } else {
                this.nomalize();
                return this.getNumerator() + "/" + this.getDenominator();
            }
        }
    }

    //add method
    public void add(Fraction a, Fraction b) {
        this.setNumerator(a.getNumerator() * b.getDenominator() + b.getNumerator() * a.getDenominator());
        this.setDenominator(a.getDenominator() * b.getDenominator());
    }

    //subtract
    public void subtract(Fraction a, Fraction b) {
        this.setNumerator(a.getNumerator() * b.getDenominator() - b.getNumerator() * a.getDenominator());
        this.setDenominator(a.getDenominator() * b.getDenominator());
    }

    //multiply
    public void multiply(Fraction a, Fraction b) {
        this.setNumerator(a.getNumerator() * b.getNumerator());
        this.setDenominator(a.getDenominator() * b.getDenominator());
    }

    //divide
    public void divide(Fraction a, Fraction b) {
        if (b.getNumerator() != 0) {
            this.setNumerator(a.getNumerator() * b.getDenominator());
            this.setDenominator(a.getDenominator() * b.getNumerator());
        } else {
            System.out.println("Math Error");
        }
    }

    //compare
    @Override
    public boolean equals(Object obj) {
        
        if (obj instanceof Fraction) {
            if (((Fraction) obj).getDenominator() == this.getDenominator() && ((Fraction) obj).getNumerator() == this.getNumerator()) {
                return true;
            }
        }
        return false;
    }
}
