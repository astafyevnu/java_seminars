package seminar3.hw;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class M2Del_nums {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            Random random = new Random();
            int num = random.nextInt(100);
            arr.add(num);
        }

        System.out.println("\nИсходный список рандомных целых чисел: \n" + arr);

        for (int i = 0; i < arr.size();) {
            if (arr.get(i) % 2 == 0) {
                arr.remove(i);
            } else {
                i++;
            }
        }
        System.out.println("Список после удаления четных чисел:\n" + arr);

    }
}