public class Main3 {
    public static void main(String[] args) {
Robot1 robot = new Robot1();
robot.setX(2);
robot.setY(0);
robot.move(6,10);
        System.out.println("Второе перемещение");
        robot.move(10,16);
    }
}
