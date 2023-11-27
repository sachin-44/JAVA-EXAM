import java.util.Scanner;

class Student {
    String name;
    double marks;

    // Constructor to initialize the student details
    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        // Create an array to store 'n' Student objects
        Student[] students = new Student[n];

        // Input details for each student
        for (int i = 0; i < n; i++) {
            scanner.nextLine(); // Consume the newline character
            System.out.println("Enter details for Student " + (i + 1));
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Marks: ");
            double marks = scanner.nextDouble();

            // Create a new Student object and store it in the array
            students[i] = new Student(name, marks);
        }

        // Display details for each student
        System.out.println("\nStudent Details:");
        for (int i = 0; i < n; i++) {
            System.out.println("\nDetails for Student " + (i + 1));
            students[i].displayDetails();
        }

        // Close the scanner
        scanner.close();
    }
}
