package seminar2.hw;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Logger;

public class m4_calc {
    private static Logger logger = Logger.getLogger(m4_calc.class.getName());

    public static void main(String[] args) {

        double num1;
        double num2;
        double res = 0;
        char act;

        try (PrintWriter out = new PrintWriter("file.txt")) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Input first number: ");
            num1 = sc.nextInt();

            System.out.print("Input second number: ");
            num2 = sc.nextInt();

            System.out.print("Action: ");
            act = sc.next().charAt(0);;

            switch (act) {
                case '+':
                    res = num1 + num2;
                    break;
                case '-':
                    res = num1 - num2;
                    break;
                case '*':
                    res = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0)
                        System.out.print("Error!");
                    else {
                        res = num1 / num2;
                    }
                    break;
                case '%':
                    res = num1 % num2;
                    break;
                default:
                    System.out.printf("Error!");
                    return;
            }
            System.out.println(("Result: " + res));
            out.printf("%f %c %f = " + res + "\n", num1, act, num2);

            logger.info("Результат записан в файл: file.txt");
        } catch (FileNotFoundException e) {
            logger.info(e.getMessage());
        }
    }
}
