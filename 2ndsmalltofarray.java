import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SecondSmallestElementWriter {

    public static void main(String[] args) {
        // Input array containing numbers
        int[] numbers = inputNumbers();

        // Find the second smallest element and write it to the output file
        writeSecondSmallestElementToFile(numbers, "second_smallest_element.txt");
    }

    private static int[] inputNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        return numbers;
    }

    private static void writeSecondSmallestElementToFile(int[] numbers, String fileName) {
        if (numbers.length < 2) {
            System.out.println("The array should have at least two elements. Cannot find the second smallest element.");
            return;
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : numbers) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Second Smallest Element: " + secondSmallest);
            System.out.println("Second smallest element has been written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
