import java.util.Scanner;

class Complex {
    int real;
    int imaginary;

    Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    void subtract(Complex o) {
        int realPart = this.real - o.real;
        int imagPart = this.imaginary - o.imaginary;
        System.out.println("The difference is " + realPart + " + " + imagPart + "i");
    }
}

public class ComplexSubtraction {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first complex number:");
        int r1, i1, r2, i2;
        r1 = s.nextInt();
        i1 = s.nextInt();
        System.out.println("Enter the second complex number:");
        r2 = s.nextInt();
        i2 = s.nextInt();
        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);
        c1.subtract(c2);
    }
}
