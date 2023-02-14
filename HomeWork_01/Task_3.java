package HomeWork_01;
import java.util.Scanner;

// Задача 3. Реализовать простой калькулятор (+ - / *)

public class Task_3 {
    public static void main(String[] args) { // Ввод данных пользователем
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = Integer.parseInt(sc.nextLine());

        System.out.print("Выберите действие (+ - / *): ");
        String action = sc.nextLine();

        System.out.print("Введите второе число: ");
        int num2 = Integer.parseInt(sc.nextLine());

        sc.close();

        System.out.print(num1 + " " + action + " " + num2 + " = "); // Вывод данных 

        switch (action) { // Выбор математического действия
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Некеорректный ввод!");
        }
    }
}


