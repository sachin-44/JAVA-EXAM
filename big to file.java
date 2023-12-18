import java.io.*;
import java.util.Scanner;

public class BiggestElementWriter {

    public static void main(String[] args) {
        // Input file containing numbers
        String inputFileName = "input_numbers.txt";
        // Output file to write the biggest element
        String outputFileName = "biggest_element.txt";

        // Read numbers from the input file
        int biggestElement = findBiggestElementFromFile(inputFileName);

        // Write the biggest element to the output file
        writeBiggestElementToFile(biggestElement, outputFileName);
    }

    private static int findBiggestElementFromFile(String fileName) {
        int biggestElement = Integer.MIN_VALUE;

        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextInt()) {
                int currentElement = scanner.nextInt();
                if (currentElement > biggestElement) {
                    biggestElement = currentElement;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return biggestElement;
    }

    private static void writeBiggestElementToFile(int biggestElement, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(Integer.toString(biggestElement));
            System.out.println("Biggest element has been written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
