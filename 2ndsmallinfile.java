import java.io.*;
import java.util.Scanner;

public class SecondSmallestElementFileWriter {

    public static void main(String[] args) {
        // Input file containing numbers
        String inputFileName = "input_numbers.txt";
        // Output file to write the second smallest element
        String outputFileName = "second_smallest_element.txt";

        // Read numbers from the input file
        java.util.Set<Integer> numbers = readNumbersFromFile(inputFileName);

        // Find the second smallest element and write it to the output file
        writeSecondSmallestElementToFile(numbers, outputFileName);
    }

    private static java.util.Set<Integer> readNumbersFromFile(String fileName) {
        java.util.Set<Integer> numbers = new java.util.TreeSet<>(); // Using fully qualified names

        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return numbers;
    }

    private static void writeSecondSmallestElementToFile(java.util.Set<Integer> numbers, String fileName) {
        if (numbers.size() < 2) {
            System.out.println("The set should have at least two elements. Cannot find the second smallest element.");
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
