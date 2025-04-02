public class Main5 {
    public static void main(String[] args) {
        //создаем фактуру
        Body body = new Body("Седан", "Баклажан");
        Wheels wheels = new Wheels(4, true);
        Engine engine = new Engine("Бензин", 75);

        Car car = new Car(body, engine, wheels);
        System.out.println("Мощность двигателя: " + car.getEngine().getVolume() + " л.с.");
        System.out.println(car);
    }
}
