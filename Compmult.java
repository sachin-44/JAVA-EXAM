import java.util.Scanner;
class Complex{
	int real;
	int imaginary;
	
	Complex(int real,int imaginary)
	{
		this.real=real;
		this.imaginary=imaginary;
	}
	
	void product(Complex o)
	{
		int realPart;
		int imagPart;
		realPart=(real*o.real)-(imaginary*o.imaginary);
		imagPart=(real*o.imaginary)+(imaginary*o.real);
		System.out.println("The product is "+ realPart+" + "+imagPart+"i");
	}
}

 class Complex_57{
 	public static void main(String args[]){
 	    Scanner s=new Scanner(System.in);
 	    System.out.println("Enter the first number");
 	    int r1,i1,r2,i2;
 	    r1=s.nextInt();
 	    i1=s.nextInt();
 	    System.out.println("Enter the second number");
 	    r2=s.nextInt();
 	    i2=s.nextInt();
 		Complex c1=new Complex(r1,i1);
 		Complex c2=new Complex(r2,i2);
 		c2.product(c1);
 	
 	}
 }
 
