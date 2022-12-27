package seminar1;

// import java.util.Scanner;

/*
1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n) 
2. Вывести все простые числа от 1 до 1000 
*/

// public class Main {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Input N: ");
//         int num = scanner.nextInt();
//         int sum = 0;
//         int prod = 1;

//         for (int i = 0; i <= num; i++) {

//             sum += i;
//             if (i > 0)
//                 prod *= i;

//         }
//         System.out.println("Сумма чисел от 1 до " + num + " = " + sum);
//         System.out.println("Произведение чисел от 1 до " + num + " = " + prod);

//         System.out.println("Все простые числа от 1 до 1000: ");
//         for (int i = 2; i < 1000; i++) {

//             if ((i % 2 != 0 || i == 2) && (i % 3 != 0 || i == 3) && (i % 5 != 0 || i == 5) && (i % 7 != 0 || i == 7)) {
//                 System.out.print(i + " ");

//             }

//         }
//     }
// }


// 3. Реализовать простой калькулятор

// public class Main {

//     public static void main(String[] args){
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Input first number: ");
//         int num1 = scanner.nextInt();

//         System.out.print("Input second number: ");
//         int num2 = scanner.nextInt();

//         System.out.print("Action: ");
//         String act = scanner.nextLine();
//         act = scanner.nextLine();
        
//         int res;
//         switch (act) {
//             case "+": 
//                 res = num1 + num2;
//                 System.out.print("Result: " + res);
//                 break;
//             case "-": 
//                 res = num1 - num2;
//                 System.out.print("Result: " + res);
//                 break;
//             case "*": 
//                 res = num1 * num2;
//                 System.out.print("Result: " + res);
//                 break;
//             case "/":
//                 if(num2 == 0)
//                     System.out.print("Error!");
//                 else {
//                     res = num1 / num2;
//                     System.out.print("Result: " + res);
//                 }
//                 break;
//             case "%": 
//                 res = num1 % num2;
//                 System.out.print("Result: " + res);
//                 break;
//         }
//     }
// }


// 4. +Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

public class Main {

    public static void main(String[] args){
    // int x = int(String)

    for (int i = 0; i >= 0; i++){
        if (20 + i + (i * 10) +5 == 78){
            System.out.print("2" + i + " + " + i + "5 = 78");
        break;
        }
        else {
            for (int k = 0; k >= 0 && k < 10; k++){
                int q = 20 + k;
                for (int j = 0; j >= 0 && j < 10; j++){
                    int w = j * 10 +5;
                    if (q + w == 78){
                        System.out.println("2" + k + " + " + j + "5 = 78");
                    
                    }
                
                }
            }
        break;
        }        
    }
    }
}