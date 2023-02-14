package HomeWork_01;
import java.util.Scanner;

// Задача 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)

public class Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Получение данных от пользователя, вывод в консоль
        System.out.print("Введите N для вычисления треугольного числа N: ");
        int number1 = Integer.parseInt(sc.nextLine());
        System.out.print("Ответ: ");
        System.out.println(triangularNumber(number1));

        System.out.print("Введите N для вычисления факториала N: ");
        int number2 = Integer.parseInt(sc.nextLine());
        System.out.print("Ответ: ");
        System.out.println(factorial(number2));

        sc.close();
    }
    // Функция нахождения треугольного числа

    public static int triangularNumber(int number1) {
        return (number1 / 2) * (number1 + 1);
    }
    // Функция нахождения факториала числа

    public static int factorial(int number2) {
        int result = 1;

        for (int i = 2; i <= number2; i++) 
        result *= i;

        return result;
    }
}
    

