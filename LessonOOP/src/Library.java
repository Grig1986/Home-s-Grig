import java.util.Scanner;

public class Library {
    static String booksInfo = "";

    public static void main(String[] args) {
        while (true) {
        String name = inputBookName();
        String name1 = inputBookAuthor();
        int pageCount = inputPageCount();
        double bookPrice = inputBookPrice();
        addBook(name, name1) ;
        addBook(name, pageCount);
        addBook(name, pageCount, bookPrice);
        printInfo();
    }
    }
    private static double inputBookPrice() {
        System.out.println("Введите стоимость книги: ");
        return new Scanner(System.in).nextDouble();
    }
    public static String inputBookName() {
        System.out.println("Введите название книги: ");
       return new Scanner(System.in).nextLine();
        }
        public static int inputPageCount() {
            System.out.println("Введите количество страниц: ");
            return new Scanner(System.in).nextInt();
        }
        public static String inputBookAuthor() {
            System.out.println("Введите автора книги: ");
            return new Scanner(System.in).nextLine();
        }

        public static void addBook(String bookName, String bookAuthor) {
        addBook(bookName, 0);
    }
    public static void addBook(String bookName, int pageCount){
        addBook(bookName, pageCount, 0);
    }
    public static void addBook(String bookName, int pageCount, double bookPrice) {
        booksInfo = booksInfo + bookName + " - " + (pageCount > 0 ? pageCount : "N/A") + " стр. " + (bookPrice > 0 ? bookPrice + " руб.": "не определена") + "\n";
    }
    public static void printInfo() {
        System.out.println(booksInfo);
    }
}
