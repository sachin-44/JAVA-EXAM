import java.util.Scanner;

interface Polygon {
    
    void findArea(int dim1, int dim2);
}

class Rectangle implements Polygon {
  
    public void findArea(int length, int width) {
        int area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle implements Polygon {
 
    public void findArea(int base, int height) {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}

public class Polygon{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.println("Enter dimensions for Rectangle:");
        System.out.print("Length: ");
        int rectangleLength = scanner.nextInt();
        System.out.print("Width: ");
        int rectangleWidth = scanner.nextInt();

      
        System.out.println("Enter dimensions for Triangle:");
        System.out.print("Base: ");
        int triangleBase = scanner.nextInt();
        System.out.print("Height: ");
        int triangleHeight = scanner.nextInt();

        
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();

        
        rectangle.findArea(rectangleLength, rectangleWidth);
        triangle.findArea(triangleBase, triangleHeight);

        scanner.close();
    }
}
