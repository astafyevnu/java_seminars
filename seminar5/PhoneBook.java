package seminar5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    public static Map<String, List<Integer>> pb = new HashMap<>();

    public static void main(String[] args) {
        addContact();
        System.out.println("PhoneBook:\n" + pb);
        System.out.println("\nВывод определенного контакта:");
        getContact("Анна Мусина");
        del("Анна Мусина");
        System.out.println("\n\nPhoneBook после удаления определенного контакта:\n" + pb);
    }

    public static void addContact() {
        pb.put("Светлана Петрова", List.of(522588, 622356));
        pb.put("Анна Мусина", List.of(635532, 533542));
        pb.put("Иван Юрин", List.of(323463));
        pb.put("Петр Чернышов", List.of(327663));
        pb.put("Мария Федорова", List.of(346463));

    }

    public static void getContact(String name) {
        System.out.printf("%s: %s", name, pb.get(name));
    }

    public static void del(String name) {
        pb.remove(name);
    }

}
