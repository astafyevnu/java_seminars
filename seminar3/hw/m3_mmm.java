package seminar3.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Random;

public class m3_mmm {

    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < 20; i++) {
            Random random = new Random();
            int num = random.nextInt(1000);
            lst.add(num);
            count += num;
        }
        System.out.println("\nCписок рандомных целых чисел:\n" + lst);
        Collections.sort(lst);

        System.out.println("Минимальное число: " + lst.get(0));
        System.out.println("Максимальное число: " + lst.get(19));
        System.out.println("Среднее арифметическое списка: " + count / 20);
    }

}