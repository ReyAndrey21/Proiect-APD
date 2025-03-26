import java.io.FileWriter;
import java.io.IOException;

public class FileSaver {
    public static void saveArrayToFile(int[] array, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (int num : array) {
                writer.write(num + "\n");
            }
            System.out.println("The array has been saved in file: " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}

