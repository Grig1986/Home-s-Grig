public class Human2 {
    String name;
    String gender;
    int age;
    String profession;

    public Human2() {
    }
    public Human2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human2(String name, String gender, int age, String profession) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.profession = profession;
    }
    public void work(int hourWork) {
        System.out.println(name + " проработал " + hourWork + " часов.");
    }
}
