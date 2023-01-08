package seminar5;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class HeapSrt {

    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        IntStream.range(0, 10)
        .forEach(index -> arr[index] = random.nextInt(30));
        
        System.out.print("\nИсходный массов: " + Arrays.toString(arr));
        
        HeapSrt hs = new HeapSrt();
        hs.heapSort(arr);

        System.out.println("\n\nОтсортированный массив: " + Arrays.toString(arr));
    }

    void heapSort(int[] arr) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heap(arr, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heap(arr, i, 0);
        }
    }

    void heap(int[] arr, int n, int i) {
        int max = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[max]) {
            max = left;
        }

        if (right < n && arr[right] > arr[max]) {
            max = right;
        }

        if (max != i) {
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
            heap(arr, n, max);
        }
    }
}