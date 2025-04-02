public class Main2 {
    public static void main(String[] args) {
        Phone phone = new Phone("Alcatel", 120.0, "33-90-93");
        phone.receiveCall("Вася");
        Phone phone1 = new Phone("Motorola", 120.0, "33-54-19");

    Phone.madeIn = "China";
        System.out.println("Сделано в " + phone.madeIn);
        System.out.println("Сделано в " + phone1.madeIn);
    }
}
