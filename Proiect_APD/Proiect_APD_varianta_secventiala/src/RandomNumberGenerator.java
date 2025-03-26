import java.util.Random;

public class RandomNumberGenerator {
    public static int[] generateRandomNumber(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(20000000);
        }
        return array;
    }
}
