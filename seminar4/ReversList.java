package seminar4;

import java.util.LinkedList;

public class ReversList {

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 4, 5 };
        LinkedList<Integer> lst = new LinkedList<Integer>();

        for (Integer i : arr) {
            lst.add(i);
        }
        System.out.println("Исходный список: " + lst);
        int i = 0;
        while (i != lst.size() - 1) {
            lst.add(lst.size() - i, lst.getFirst());
            lst.removeFirst();
            i++;
        }

        System.out.println("Перевернутый список: " + lst);
    }
}