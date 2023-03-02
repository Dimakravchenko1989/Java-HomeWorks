import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// Задача 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Добавить функции 
// 1) Добавление номера
// 2) Вывод всего

public class Task_1 {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Ivanov", 111, bookPhone);
        addNumber("Ivanov", 222, bookPhone);
        addNumber("Petrov", 333, bookPhone);
        addNumber("Sidorov", 444, bookPhone);
        addNumber("Ivanov", 555, bookPhone);
        addNumber("Petrov", 666, bookPhone);
        printBook(bookPhone);
    }
        // Метод, который добавляет номера в книгу
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }
        // Метод, который печатает список контактов
    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var el: map.entrySet()) {
            System.out.print(el.getKey() + ":"+ el.getValue());
            System.out.println();
        }
    }
}   