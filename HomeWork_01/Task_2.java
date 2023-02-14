package HomeWork_01;

// Задача 2. Вывести все простые числа от 1 до 1000

public class Task_2 {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++)
            if (primeNumbers(i))
                System.out.print(i + " ");
    }

    public static boolean primeNumbers(int number) {
        for (int i = 2; i * i <= number; i++)
            if (number % i == 0)
                return false;

        return true;
    }
}
