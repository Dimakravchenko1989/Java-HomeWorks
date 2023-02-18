// Задача 1. Пусть дан произвольный список целых чисел, удалить из него четные числа

package HomeWork_03;
import java.util.ArrayList;

public class Task_1 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array = RandomArray(10);
        PrintArray(array);
        DeleteEvenNumber(array);
        PrintArray(array);
    }
    // Функция удаления чисел из списка
   public static void DeleteEvenNumber(ArrayList<Integer> list){
        int i = 0;
        while (i < list.size()){
            if(list.get(i) % 2 == 0) list.remove(i);
            else i++;
        }
    }
    // Фукция печати списка
    public static void PrintArray(ArrayList<Integer> arr){ 
        for(int element: arr) {
            System.out.print(element + " ");
            } 
            System.out.println();
    }
    // Функция заполнения списка случайными целыми числами
    public static ArrayList<Integer> RandomArray(int n) { 
        ArrayList <Integer> list = new ArrayList<>();
            for(int i = 0; i < n; i++){
                list.add((int)(Math.random()*100));
            }
            return list;
    } 
}
