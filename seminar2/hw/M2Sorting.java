package seminar2.hw;

import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.Arrays;
import java.io.FileNotFoundException;
import java.io.IOException;

public class m2_sorting {
    private static Logger logger = Logger.getLogger(m2_sorting.class.getName());

    public static void main(String[] args) throws SecurityException, IOException {
        int arr[] = { -8, 6, -4, 7, 8, 3, 2, -9, 1, 0, -1, -8, 6, -4 };
        int temp = 1;
        FileHandler fh;

        try {
            fh = new FileHandler("log.log");  
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
            for (int i = 0; i < arr.length; i++) {
                for (int j = 1; j < arr.length - i; j++) {
                    if (arr[j - 1] > arr[j]) {
                        temp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            System.out.println("Результат записан в файл: log.log");
            logger.info(Arrays.toString(arr));
        } catch (FileNotFoundException e) {
            logger.info(e.getMessage());
        }

    }
}
