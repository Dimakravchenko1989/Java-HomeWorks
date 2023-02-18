// Задача 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.

package HomeWork_03;

import java.util.ArrayList;
public class Task_2 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        System.out.println("Исходный список: "); // Задаём список
        array.add(10);
        array.add(1);
        array.add(98);
        array.add(5);
        array.add(2);
        array.add(-3);
        array.add(5);
        array.add(-5);
        array.add(34);
        array.add(6);

        for(int i = 0; i < array.size(); i++){
            System.out.print(array.get(i) + " "); // Выводим список в консоль
        }
        System.out.println("\n");
        System.out.printf("Максимальное число: %d \n", MaxNumber(array));
        System.out.printf("Минимальное число: %d \n", MinNumber(array));
        System.out.printf("Среднее арифметическое: %.1f \n", ArithmeticMean(array));
    }
    // Функция нахождения максимального числа из списка
    public static int MaxNumber(ArrayList<Integer> arr){
        int max = arr.get(0);
        for(int element : arr){
            if(element > max) max = element;
        }
        return max;
    }
    // Функция нахождения минимального числа из списка
    public static int MinNumber(ArrayList<Integer> arr){
        int min = arr.get(0);
        for(int element : arr){
            if(element < min) min = element;
        }
        return min;
    }
    // Функция нахождения среднего арифметического числа
    public static Double ArithmeticMean(ArrayList<Integer> arr){
        int sum = 0;
        for(int element : arr){
            sum += element;
        }
        Double am = Double.valueOf(sum)/Double.valueOf(arr.size());
        return am;
    }

}