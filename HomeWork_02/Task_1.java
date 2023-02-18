// Задача 1. Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

public class Task_1 {
    public static void main(String[] args) throws IOException {
        // Создаём логер
        Logger logger = Logger.getLogger(Task_1.class.getName());
        FileHandler fh = new FileHandler("logTask_1.txt");
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);
        logger.info("Sort Array");
        
        // Исходный массив 
        int [] array = {2, 14, 1, -7, 3, 89, 0};
        printArray(array);

        // Сортируем массив и записываем в лог-файл
        int[] newArr = sortArray(array, logger);
        System.out.printf("\n Отсортированный массив: \n");
        printArray(newArr);
    }
   
    // Функция для печати массива
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.print(arr[arr.length-1]);
    }
    // Функция для сортировки массива и записи в лог
    public static int[] sortArray(int [] arr, Logger logger){
        for(int k = 0; k < arr.length-1; k++) {
            for (int i = 0; i < arr.length - k-1; i++){
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    logger.info(Arrays.toString(arr));
                }
            }
        }
        return arr;
    }
}