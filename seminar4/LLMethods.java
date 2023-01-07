package seminar4;

import java.util.LinkedList;

public class LLMethods {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

        LinkedList<Integer> lst = new LinkedList<Integer>();
        for (Integer i : arr) {
            lst.add(i);
        }
        System.out.println("Очередь: " + lst);

        System.out.println("\nМетод enqueue() - помещает элемент в конец очереди:\nНовый элемент: " + enqueue(lst)
                + "\nОчередь: " + lst);

        System.out.println("\nМетод dequeue() - возвращает первый элемент из очереди и удаляет его:\nПервый элемент: "
                + dequeue(lst) + "\nОчередь: " + lst);

        System.out.println("\nМетод first:\nfirst() - возвращает первый элемент из очереди, не удаляя:\nПервый элемент:"
                + first(lst) + "\nОчередь: " + lst);
    }

    public static int enqueue(LinkedList<Integer> arr) {
        int num = 9;
        arr.add(num);
        return num;
    }

    public static int dequeue(LinkedList<Integer> arr) {
        int num = 0;
        num = arr.get(0);
        arr.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> arr) {
        int num = 0;
        num = arr.get(0);
        return num;
    }
}