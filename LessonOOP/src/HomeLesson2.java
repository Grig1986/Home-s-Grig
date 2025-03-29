import java.util.Scanner;


public class HomeLesson2 {
    public static void main(String[] args) {
        test();
        print();
    }
    private static void test() {
        System.out.println("Введите число: ");
        int input = new Scanner(System.in).nextInt();
        System.out.println(input % 2 == 0);
    }
private static void print() {
    System.out.println(getInput() % 2 == 0);
}
public static int getInput() {
    System.out.println("Введите число: ");
    return new Scanner(System.in).nextInt();
}
    }



