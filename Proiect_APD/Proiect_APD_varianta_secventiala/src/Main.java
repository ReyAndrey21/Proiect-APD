import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = RandomNumberGenerator.generateRandomNumber(size);
        FileSaver.saveArrayToFile(array, "initial_array.txt");

        long startTime = System.nanoTime();
        MergeSort.mergeSort(array);
        long endTime = System.nanoTime();

        FileSaver.saveArrayToFile(array, "sort_array.txt");

        long duration = endTime - startTime;
        System.out.println("Execution time: " + (duration / 1000000.0) + " ms");

        scanner.close();
    }
}
