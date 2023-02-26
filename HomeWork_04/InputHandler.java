package HomeWork_04;
import java.util.Scanner;
import java.util.Vector;

public class InputHandler {

    private Scanner userInput = new Scanner(System.in);
    private boolean keepOn = true;
    private String yesOrNo;
    public Vector<Double> calculations = new Vector<>();

    public void start() {
        System.out.println("Добро пожаловать в калкулятор!");
        while(keepOn == true) {
            calculate();
        }
    }

    public String chooseOperator() {
    System.out.println("Что делать?" +
            "\n + для сложения" +
            "\n - для вычитания" +
            "\n * для умножения" +
            "\n / для деления");

    String operator = userInput.next();
    
    return operator;
  }

  public double getFirstNumber() {
    System.out.println("Введите 1-е число");
    return userInput.nextDouble();
  }

  public double getSecondNumber() {
    System.out.println("Введите 2-е число");
    return userInput.nextDouble();
  }

  public void addition(double a, double b){
    calculations.addElement(a + b);
    System.out.println("Число равно: " + (a + b));
  }

  public void division(double a, double b){
    calculations.addElement(a / b);
    System.out.println("Число равно: " + (a / b));
  }

  public void mult(double a, double b){
    calculations.addElement(a * b);
    System.out.println("Число равно: " + (a * b));
  }

  public void sub(double a, double b){
    calculations.addElement(a - b);
    System.out.println("Число равно: " + (a - b));
  }

  public void showMenu() {
    int z = 0;
    while (z != 1){ 
      System.out.println("Пожалуйста, нажмите соответствующий номер для операции, которую вы хотите выполнить.");
      System.out.println("1. Еще одна операция?");
      System.out.println("2. История?");
      System.out.println("3. Выход?");
      
      yesOrNo = userInput.next();

      if(yesOrNo.equals("1")) {
        z = 1;
        calculate();
      }
      else if (yesOrNo.equals("3")) {
        z = 1;
        keepOn = false;
        exitMessage();
      }
      else if (yesOrNo.equals("2")){
        loadHistory();
      }
    }
  }

  public void loadHistory() {
    System.out.println("Вот расчеты, которые вы сделали до сих пор: ");

    for (int i = 0; i < calculations.size(); i++){
      System.out.println(calculations.get(i));
    }
  }

  public void exitMessage() {
    System.out.println("Вот результаты вычислений, которые вы выполнили до сих пор: ");

    for (int i = 0; i < calculations.size(); i++){
      System.out.println(calculations.get(i));
    }

    System.out.println("Благодарим вас за использование нашей программы! Надеюсь, вам понравился этот опыт!");
  }

  public void calculate() {
    int x = 0; 
    String operation;
    
    while (x < 1) {
      operation = chooseOperator();
      if(operation.equals("+")){
        double num1 = getFirstNumber();
        double num2 = getSecondNumber();
        addition(num1, num2);
        x = 1;
      }
      else if (operation.equals("-")) {
        double num1 = getFirstNumber();
        double num2 = getSecondNumber();
        sub(num1, num2);
        x = 1;
      }
      else if (operation.equals("/")) {
        double num1 = getFirstNumber();
        double num2 = getSecondNumber();
        division(num1, num2);
        x = 1;
      }
      // aint working have to do fix it
    else if (operation.equals("*")) {
      double num1 = getFirstNumber();
      double num2 = getSecondNumber();
      mult(num1, num2);
      x = 1;
    } // end of multiplication 
  }
    if (x == 1) {
      showMenu();
    }
} 
}