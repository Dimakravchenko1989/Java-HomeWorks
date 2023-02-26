package HomeWork_04;

// Задача 3. В калькулятор добавьте возможность отменить последнюю операцию.
// Пример:
// 1 + 2 ответ: 3
// + 4 ответ: 7 
// Отмена 3 
// * 3 ответ: 9

import java.util.LinkedList;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        LinkedList<Double> result = new LinkedList<>();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите первое число: ");
            result.add(sc.nextDouble());
            sc.nextLine();

            while(true) {
                System.out.print("Выберите действие (+ - / *, C - для отмены): ");
                String action = sc.nextLine();
                
                if ("C".equals(action)) // Отмена последней операции
                    result.remove();
                else {
                    System.out.print("Введите второе число: ");
                    double num2 = sc.nextDouble();

                    mathematicAction(result, action, num2);
                    sc.nextLine();
                    }
                    
                System.out.println("Результат: " + result.getFirst());
            }
        }
    }

    // Фунция выбора математического действия
    
    public static void mathematicAction(LinkedList<Double> list, String action, double number) {
        switch (action) {
            case "+":
                list.add(0, list.getFirst() + number);
                break;         
            case "-":
                list.add(0, list.getFirst() - number);
                break;
            case "*":
                list.add(0, list.getFirst() * number);
                break;
            case "/":
                list.add(0, list.getFirst() / number);
                break;
            default:
                System.out.println("Некеорректный ввод!");
        }
    }
}
