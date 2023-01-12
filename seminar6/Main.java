package seminar6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        getFilter(parametrs());
    }

    private static Set<Object> Laptops() {
        Laptop lpt0 = new Laptop("HP", "H6-4128", 4, 128, "Windows 10", "Белый");
        Laptop lpt1 = new Laptop("Samsung", "R700b", 4, 128, "Windows 10", "Черный");
        Laptop lpt2 = new Laptop("Sony", "V3000w", 8, 256, "Windows 11", "Белый");
        Laptop lpt3 = new Laptop("Samsung", "R710s", 8, 256, "Windows 10", "Серебряный");
        Laptop lpt4 = new Laptop("Samsung", "R720w", 8, 512, "Windows 10", "Белый");
        Laptop lpt5 = new Laptop("Samsung", "R820b", 8, 512, "Windows 11", "Черный");
        Laptop lpt6 = new Laptop("Samsung", "R850r", 16, 1024, "Windows 11", "Красный");
        Laptop lpt7 = new Laptop("MSI", "X4070", 32, 2056, "Windows 11", "Красный");
        Laptop lpt8 = new Laptop("Acer", "G7550", 8, 512, "Windows 11", "Черный");
        Laptop lpt9 = new Laptop("HP", "G6-81w", 8, 1024, "Windows 11", "Белый");
        Laptop lpt10 = new Laptop("HP", "G6-81bl", 8, 1024, "Linux", "Черный");
        Laptop lpt11 = new Laptop("Acer", "BD70", 32, 2056, "Windows 11", "Черный");
        Laptop lpt12 = new Laptop("Asus", "X16-1", 16, 1024, "Linux", "Серебряный");

        Set<Object> setLpt = new HashSet<>();
        setLpt.add(lpt0);
        setLpt.add(lpt1);
        setLpt.add(lpt2);
        setLpt.add(lpt3);
        setLpt.add(lpt4);
        setLpt.add(lpt5);
        setLpt.add(lpt6);
        setLpt.add(lpt7);
        setLpt.add(lpt8);
        setLpt.add(lpt9);
        setLpt.add(lpt10);
        setLpt.add(lpt11);
        setLpt.add(lpt12);

        return setLpt;
    }

    private static int parametrs() {
        Map<Integer, String> parametr = new HashMap<Integer, String>();
        parametr.put(1, "Brand");
        parametr.put(2, "RAM");
        parametr.put(3, "ROM");
        parametr.put(4, "OS");
        parametr.put(5, "Color");

        System.out.print("Отбор устройства по параметрам: " + parametr + "\n");
        System.out.print("Введите значение парметра: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        return choice;
    }

    private static void getFilter(int choice) {
        if (choice == 1) {
            filterBr(Laptops());
        } else if (choice == 2) {
            filterRam(Laptops());
        } else if (choice == 3) {
            filterRom(Laptops());
        } else if (choice == 4) {
            filterOs(Laptops());
        } else if (choice == 5) {
            filterColor(Laptops());
        } else
            System.out.print("Ошибка ввода!");
    }

    private static void filterBr(Set<Object> setLpt) {
        System.out.println(
                "Выберите производителя устройства\n1 - Acer\n2 - Asus\n3 - HP\n4 - MSI\n5 - Samsung\n6 - Sony");
        System.out.print("Введите значение парметра: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        String brand = null;
        if (choice == 1) {
            brand = "Acer";
        } else if (choice == 2) {
            brand = "Asus";
        } else if (choice == 3) {
            brand = "HP";
        } else if (choice == 4) {
            brand = "MSI";
        } else if (choice == 5) {
            brand = "Samsung";
        } else if (choice == 6) {
            brand = "Sony";
        } else
            System.out.print("Ошибка ввода!");
        for (var item : setLpt) {
            String Laptop = item.toString();
            if (Laptop.contains(brand)) {
                System.out.println(item);
            }
        }
    }

    private static void filterRam(Set<Object> setLpt) {
        System.out.print("Введите необходимый объем оперативной памяти (Гб: 4, 8, 16, 32): ");
        Scanner sc = new Scanner(System.in);
        int gb = sc.nextInt();
        String ram = "RAM: " + gb;
        for (var item : setLpt) {
            String Laptop = item.toString();
            if (Laptop.contains(ram)) {
                System.out.println(item);
            }
        }
    }

    private static void filterRom(Set<Object> setLpt) {
        System.out.print("Введите необходимый объем накопителя (Гб: 128, 256, 512, 1024, 2048): ");
        Scanner sc = new Scanner(System.in);
        int gb = sc.nextInt();
        String rom = " ГБ, накопитель: " + gb;
        for (var item : setLpt) {
            String Laptop = item.toString();
            if (Laptop.contains(rom)) {
                System.out.println(item);
            }
        }
    }

    private static void filterOs(Set<Object> setLpt) {
        System.out.println("Выберите операционную систему\n1 - Win10\n2 - Win11\n3 - Linux");
        System.out.print("Введите значение парметра: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        String os = null;
        if (choice == 1) {
            os = "Windows 10";
        } else if (choice == 2) {
            os = "Windows 11";
        } else if (choice == 3) {
            os = "Linux";
        } else
            System.out.print("Ошибка ввода!");
        for (var item : setLpt) {
            String Laptop = item.toString();
            if (Laptop.contains(os)) {
                System.out.print(item);
            }
        }
    }

    private static void filterColor(Set<Object> setLpt) {
        System.out.print("Выберите цвет устройства\n1 - Черный\n2 - Белый\n3 - Красный\n4 - Серебряный\n");
        System.out.print("Введите значение парметра: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        String color = null;
        if (choice == 1) {
            color = "Черный";
        } else if (choice == 2) {
            color = "Белый";
        } else if (choice == 3) {
            color = "Красный";
        } else if (choice == 4) {
            color = "Серебряный";
        } else
            System.out.print("Ошибка ввода!");
        for (var item : setLpt) {
            String Laptop = item.toString();
            if (Laptop.contains(color)) {
                System.out.println(item);
            }
        }
    }
}