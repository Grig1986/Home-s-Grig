public class Main1 {
    public static void main(String[] args) {
        Human2 vasya = new Human2("Вася", "m", 35, "engineer");
        System.out.println("Имя " + vasya.name + " возраст " + vasya.age + " пол " + vasya.gender + " профессия " + vasya.profession);
        Human2 petya = new Human2("Петя", "m", 57, "doctor");
        System.out.println("Имя " + petya.name + " возраст " + petya.age + " пол " + petya.gender + " профессия " + petya.profession);
        vasya.work(20);
        petya.work(10);

    }
}
