package seminar4;

import java.util.Scanner;
import java.util.Stack;

public class Calc1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.print("Input first number: ");
        st.push(sc.nextInt());
        char act = action();
        System.out.print("Input second number: ");
        st.push(sc.nextInt());
        result(st, act);
        while (true) {
            System.out.println("Cancel?\nYes - 'y'\nNo - 'n'");
            act = sc.next().charAt(0);
            if (act == 'y') {
                System.out.println("First number: " + st.peek());
                act = action();
                System.out.print("Input second number: ");
                st.push(sc.nextInt());
                result(st, act);
                continue;
            }
            if (act == 'n') {
                System.out.println("Completed!");
                break;
            }
        }

    }

    public static char action() {
        System.out.println("Input action (+, -, *, /, %): ");
        char act = sc.next().charAt(0);
        if (act == '+' || act == '-' || act == '*' || act == '/' || act == '%') {
            return act;
        } else {
            throw new IllegalArgumentException("Error!");
        }
    }

    public static void result(Stack<Integer> st, Character act) {
        double b = st.pop();
        double a = st.peek();
        double res = 0;
        if (b == 0 && act == '/') {
            System.out.println("Can't divide by zero!");
        } else {
            switch (act) {
                case '+' -> res = a + b;
                case '-' -> res = a - b;
                case '*' -> res = a * b;
                case '/' -> res = a / b;
                case '%' -> res = a % b;
            }
            String string = "Result: " + a + " " + act + " " + b + " = " + res;
            System.out.println(string);
        }
    }
}