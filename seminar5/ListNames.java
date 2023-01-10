package seminar5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ListNames {

    public static void main(String[] args) throws FileNotFoundException {
        ListNames names = new ListNames();
        Map<String, Integer> book = names.getMap("D:\\2qr\\Java\\java_seminars\\seminar5\\staff.txt");
        
       // Чтобы код работал на всех устройствах следует писать относительный путь
// "seminar5/staff.txt"
        
        List<Map.Entry<String, Integer>> lst = new ArrayList<>(book.entrySet());
        lst.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        lst.forEach(System.out::println);
    }

    public Map<String, Integer> getMap(String fileName) {
        try {
            FileReader reader = new FileReader(fileName);
            Scanner sc = new Scanner(reader);
            Map<String, Integer> book = new HashMap<>();
            while (sc.hasNextLine()) {
                String name = sc.nextLine().split(" ")[0];
                if (!book.containsKey(name)) {
                    book.put(name, 1);
                } else {
                    Integer quantity = book.get(name);
                    book.put(name, quantity + 1);
                }
            }
            return book;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
