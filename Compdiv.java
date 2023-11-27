import java.util.Scanner;

class Complex {
    double real;
    double imaginary;

    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to calculate the conjugate of a complex number
    Complex conjugate() {
        return new Complex(this.real, -this.imaginary);
    }

    // Method to perform complex division
    void divide(Complex denominator) {
        // Calculate the conjugate of the denominator
        Complex conjugateDenominator = denominator.conjugate();

        // Multiply the numerator and denominator by the conjugate of the denominator
        Complex numerator = this.multiply(conjugateDenominator);
        Complex denominatorSquared = denominator.multiply(conjugateDenominator);

        // Display the result
        System.out.println("The quotient is " + numerator.real / denominatorSquared.real +
                " + " + numerator.imaginary / denominatorSquared.real + "i");
    }

    // Method to multiply two complex numbers
    Complex multiply(Complex o) {
        double realPart = this.real * o.real - this.imaginary * o.imaginary;
        double imagPart = this.real * o.imaginary + this.imaginary * o.real;
        return new Complex(realPart, imagPart);
    }
}

public class ComplexDivision {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the real part of the first complex number:");
        double r1 = s.nextDouble();
        System.out.println("Enter the imaginary part of the first complex number:");
        double i1 = s.nextDouble();
        System.out.println("Enter the real part of the second complex number:");
        double r2 = s.nextDouble();
        System.out.println("Enter the imaginary part of the second complex number:");
        double i2 = s.nextDouble();

        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);

        // Check if the denominator is not zero before performing division
        if (c2.real != 0 || c2.imaginary != 0) {
            c1.divide(c2);
        } else {
            System.out.println("Error: Division by zero is undefined.");
        }
    }
}
