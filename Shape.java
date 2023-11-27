abstract class Shape {
   
    abstract void numberOfSides();
}

class Rectangle extends Shape {
    
    void numberOfSides() {
        System.out.println("A rectangle has 4 sides.");
    }
}

class Triangle extends Shape {
    
    void numberOfSides() {
        System.out.println("A triangle has 3 sides.");
    }
}

class Hexagon extends Shape {
   
    void numberOfSides() {
        System.out.println("A hexagon has 6 sides.");
    }
}

public class Shape_21 {
    public static void main(String[] args) {
     
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();
        Shape hexagon = new Hexagon();

      
        System.out.println("Details of Shapes:");
        rectangle.numberOfSides();
        triangle.numberOfSides();
        hexagon.numberOfSides();
    }
}
