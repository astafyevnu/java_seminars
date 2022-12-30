package seminar2.hw;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Logger;

public class m4_calc {

    private static Logger logger = Logger.getLogger(m4_calc.class.getName());

    public static void main(String[] args){
        try(PrintWriter out = new PrintWriter("file.txt")) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num1 = sc.nextInt();

        System.out.print("Input second number: ");
        int num2 = sc.nextInt();

        System.out.print("Action: ");
        String act = sc.nextLine();
        act = sc.nextLine();
        
        int res;
        switch (act) {
            case "+": 
                res = num1 + num2;
                System.out.print("Result: " + res);
                break;
            case "-": 
                res = num1 - num2;
                System.out.print("Result: " + res);
                break;
            case "*": 
                res = num1 * num2;
                System.out.print("Result: " + res);
                break;
            case "/":
                if(num2 == 0)
                    System.out.print("Error!");
                else {
                    res = num1 / num2;
                    System.out.print("Result: " + res);
                }
                break;
            case "%": 
                res = num1 % num2;
                System.out.print("Result: " + res);
                break;
            }
        logger.info("Результат записан в файл: file.txt");
        }   
        catch (FileNotFoundException e) {
            logger.info(e.getMessage());
        }
    }
}
