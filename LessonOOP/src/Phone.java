public class Phone {
    String phoneNumber;
    String modPhone;
    Double weight;

    static String madeIn;

    public Phone() {
    }

    public Phone(String modPhone, Double weight, String phoneNumber ) {
        this.modPhone = modPhone;
        this.weight = weight;
        this.phoneNumber = phoneNumber;
    }
    public void receiveCall(String name) {
        receiveCall(name, "");
    }
    public void receiveCall(String name, String number) {
        System.out.println("Звонит абонент по имени " + name + (number.isEmpty() ? "" : " номер " + number));
    }
}
