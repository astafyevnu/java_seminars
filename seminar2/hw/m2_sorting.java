package seminar2.hw;

import java.io.PrintWriter;
import java.util.logging.Logger;
import java.util.Arrays;
import java.io.FileNotFoundException;

public class m2_sorting {
    private static Logger logger = Logger.getLogger(m2_sorting.class.getName());

    public static void main(String[] args) {
        int arr[] = { -8, 6, -4, 7, 8, 3, 2, -9, 1, 0, -1, -8, 6, -4 };
        int temp = 1;

        try (PrintWriter out = new PrintWriter("log.txt")) {

            for (int i = 0; i < arr.length; i++) {
                for (int j = 1; j < arr.length - i; j++) {
                    if (arr[j - 1] > arr[j]) {
                        temp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            out.println(Arrays.toString(arr));
            logger.info("Результат записан в файл: log.txt");
        } catch (FileNotFoundException e) {
            logger.info(e.getMessage());
        }

    }
}