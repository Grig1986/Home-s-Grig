import java.util.Scanner;

public class HomeLesson {
    static double a = 0;
    static double b = 0;

    public static void main(String[] args) {
a = inputDouble();
b = inputDouble();
sum();
multiply();
diff();
divide();
    }
    private static void divide() {
        System.out.println("Cумма: " + a + " / " + b + " = " + (a / b));
    }
    private static void diff() {
        System.out.println("Cумма: " + a + " - " + b + " = " + (a - b));
    }
    private static void multiply(){
        System.out.println("Cумма: " + a + " * " + b + " = " + (a * b));
    }
    private static void sum() {
        System.out.println("Cумма: " + a + " + " + b + " = " + (a + b));
    }

    private static double inputDouble() {
        System.out.println("Введите число: ");
return new Scanner(System.in).nextDouble();
    }
}


