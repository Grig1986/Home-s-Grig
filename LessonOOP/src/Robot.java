import java.util.Scanner;

public class Robot {
    static int x = 0;
    static int y = 0;

    public static void main(String[] args) {
        while (true) {
            int command = inputCommand();
            if (command == 1) {
                y -= inputSteps();
                //вниз
            } else if (command == 2) {
                y += inputSteps();
                //вверх
            } else if (command == 3) {
                x += inputSteps();
                //направо
            } else if (command == 4) {
                x -= inputSteps();
                //налево
            } else if (command == 5) {
                print();
                //печать
            } else {
                errorInput();
            }
        }
    }
    private static int errorInput() {
        System.out.println("Команда неверна!");
        return 0;
    }

    private static void print() {
        System.out.println("Координаты: x = " + x + ", y = " + y);
    }

    private static int inputSteps() {
        System.out.println("Введите количество шагов: ");
        return new Scanner(System.in).nextInt();
    }

    private static int inputCommand() {
        System.out.println("Введите команду: \n1 - пойти вниз\n2 - пойти вверх\n3 - пойти направо\n4 - пойти налево\n5 - печать координат робота");
        return new Scanner(System.in).nextInt();
    }
}


