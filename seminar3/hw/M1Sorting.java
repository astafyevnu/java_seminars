package seminar3.hw;

import java.util.Scanner;

public class M1Sorting {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите элементы массива через пробел: ");
            String rawInput = sc.nextLine();
            String[] array = rawInput.split(" ");
            int[] arr = new int[array.length];
            for (int i = 0; i < arr.length; i++)
                arr[i] = (Integer.parseInt(array[i]));
            print(arr, "Исходный массив:");
            Divine(arr);
            print(arr, "Отсортированный массив:");
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void Divine(int[] arr) {
        if (arr.length <= 1)
            return;
        int middleIndex = arr.length / 2;
        int[] first = new int[middleIndex];
        int[] second = new int[arr.length - middleIndex];

        for (int i = 0; i < middleIndex; i++)
            first[i] = arr[i];
        for (int i = middleIndex; i < arr.length; i++)
            second[i - middleIndex] = arr[i];

        Divine(first);
        Divine(second);
        Merge(arr, first, second);
    }

    public static void Merge(int[] arr, int[] first, int[] second) {
        int firstIndex = 0;
        int secondIndex = 0;
        int originalIndex = 0;
        while (firstIndex < first.length && secondIndex < second.length) {
            if (first[firstIndex] <= second[secondIndex]) {
                arr[originalIndex] = first[firstIndex];
                firstIndex++;
            } else {
                arr[originalIndex] = second[secondIndex];
                secondIndex++;
            }
            originalIndex++;
        }
        while (firstIndex < first.length) {
            arr[originalIndex] = first[firstIndex];
            firstIndex++;
            originalIndex++;
        }
        while (secondIndex < second.length) {
            arr[originalIndex] = second[secondIndex];
            secondIndex++;
            originalIndex++;
        }
    }

    public static void print(int[] array, String text) {
        System.out.println(text);
        for (int element : array)
            System.out.print(element + " ");
        System.out.println();
    }
}