package HomeWork_06.Class_Laptop;
import java.util.*;

// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. минимум 5 NoteBook notebook1 = new NoteBook NoteBook notebook2 = new NoteBook NoteBook notebook3 = new NoteBook NoteBook notebook4 = new NoteBook NoteBook notebook5 = new NoteBook
// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет
// Далее нужно запросить критерии - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
// Класс сделать в отдельном файле
// Пример: ----->
// приветствие
// Выбор параметра:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет
// выбор конкретнее
// 1 ---> Введите колво ---> 16
// вывод всех подходящих ноутбуков по параметру

public class Filter {
    public static void main(String[] args) {
        // Создаем каталог ноутбуков
        Laptop lap1 = new Laptop("Honor", 2, 128, "Windows 10", "Lilac");
        Laptop lap2 = new Laptop("Lenovo", 4, 256, "Windows 11", "Red");
        Laptop lap3 = new Laptop("Apple", 8, 256, "MacOS", "Silver");
        Laptop lap4 = new Laptop("HP 250", 32, 512, "Windows 10", "Gray");
        Laptop lap5 = new Laptop("Xiomi", 16, 256, "Windows 11", "Black");
        Laptop lap6 = new Laptop("Aser", 32, 128, "Windows 10", "Gray");
        Laptop lap7 = new Laptop("Asus", 16, 512, "DOS", "Black");
        
        // Меню основной программы
        System.out.println("Выберите паратметр для фильтра:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем SSD");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");
        Scanner sc = new Scanner(System.in,"ibm866");
        Integer choice = sc.nextInt();
            if(choice == 1){
                System.out.printf("Введите значение ОЗУ: ");
                Integer ram = sc.nextInt();
                if(ram == 32){
                    System.out.println(lap4.toString() + "\n"+ lap6.toString() + "\n");

                }else if(ram == 16){
                    System.out.println(lap5.toString() + "\n" + lap7.toString() + "\n");

                }else if(ram == 8){
                    System.out.println(lap3.toString() + "\n");

                }else if(ram == 4){
                    System.out.println(lap2.toString());

                }else System.out.println("Таких ноутбуков нет!");

            }else if(choice == 2){
                System.out.printf("Введите объем SSD: ");
                Integer ssd = sc.nextInt();
                if(ssd == 512){
                    System.out.println(lap4.toString() + "\n" + lap7.toString() + "\n");

                }else if(ssd == 256){
                    System.out.println(lap2.toString() + "\n" + lap3.toString() + "\n" + 
                    lap5.toString());

                }else if(ssd == 128){
                    System.out.println(lap1.toString() + "\n" + lap6.toString());
                
                }else System.out.println("Таких ноутбуков нет!");
            
            }else if(choice == 3){

                System.out.println("Введите название OS:");
                Scanner sc1 = new Scanner(System.in);
                String os = sc1.nextLine();
                if(os.equals("Windows")){
                    System.out.println(lap1.toString() + "\n" + lap2.toString() + "\n" +
                    lap4.toString() + "\n" + lap5.toString() + "\n"+
                    lap6.toString() + "\n");

                }else if(os.equals("Windows 10")){
                    System.out.println(lap1.toString() + "\n" + lap4.toString() + "\n" + 
                    lap6.toString());

                }else if(os.equals("Windows 11")){
                    System.out.println(lap2.toString() + "\n" + lap5.toString());

                }else if(os.equals("MacOS")){
                    System.out.printf(lap3.toString() + "\n" );

                }else System.out.println("Таких ноутбуков нет!");
                sc1.close();

            }else if(choice == 4){

                System.out.println("В наличии есть цвет: Lilac, Red, Silver, Gray, Black");
                System.out.println("Введите цвет:");
                Scanner sc1 = new Scanner(System.in);
                String color = sc1.nextLine();
                if(color.equals("Lilac")){
                    System.out.println(lap1.toString() + "\n");

                }else if(color.equals("Red")){
                    System.out.println(lap2.toString() + "\n");

                }else if(color.equals("Silver")){
                    System.out.println(lap3.toString() + "\n");

                }else if(color.equals("Gray")){
                    System.out.println(lap4.toString() + "\n" + lap6.toString() + "\n");

                }else if(color.equals("Black")){
                    System.out.println(lap5.toString() + "\n" + lap7.toString() + "\n");

                }else System.out.println("Таких ноутбуков нет!");
                
                sc1.close();
                }
            sc.close();
            }
        }
