import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

// Задача 2. Пусть дан список сотрудников:
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности Имени.


public class Task_2 {
    public static void main(String[] args) {
        Map<String, Integer> nameMap = new HashMap<>();
        String name = 
        "Иван Иванов " +
        "Светлана Петрова " +
        "Кристина Белова " +
        "Анна Мусина "+
        "Анна Крутова "+
        "Иван Юрин "+
        "Петр Лыков "+
        "Павел Чернов "+
        "Петр Чернышов "+
        "Мария Федорова "+
        "Марина Светлова "+
        "Мария Савина "+
        "Мария Рыкова "+
        "Марина Лугова "+
        "Анна Владимирова "+
        "Иван Мечников "+
        "Петр Петин "+
        "Иван Ежов ";

        String[] listOfPersons = name.split(" ");
        for (int i = 0; i < listOfPersons.length; i += 2) {
            if (nameMap.containsKey(listOfPersons[i])) {
                nameMap.replace(listOfPersons[i], nameMap.get(listOfPersons[i]) + 1);
            } else {
                nameMap.put(listOfPersons[i], 1);
            }
        }

        Map<String, Integer> sortedNameMap = new LinkedHashMap<>();
        int max = 1;
        for (int value : nameMap.values()) {
            if (value > max) {
                max = value;
            }
        }

        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : nameMap.entrySet()) {
                String key = entry.getKey();
                if (nameMap.get(key) == i) {
                    sortedNameMap.put(key, nameMap.get(key));
                }
            }
        }
        System.out.println();
        System.out.println("Повторяющиеся имена с количеством повторений: " +  nameMap);
        System.out.println("Имена, отсортированные по убыванию популярности: " + sortedNameMap);
        System.out.println();
    }
}