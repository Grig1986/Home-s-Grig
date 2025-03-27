
public class Main {
    public static void main(String[] args) {
        Random random = new Random(13, 31, 71, 256);
        for (int i = 0; i < 10; i++) {
            System.out.print(random.get() + " ");
        }
    }
    public static class Random {
        private int lastNumber;

        private final int a;
        private final int c;
        private final int m;

        public Random(int seed, int a, int c, int m) {
            this.lastNumber = seed;
            this.a = a;
            this.c = c;
            this.m = m;
        }
        public int get() {
            lastNumber = (a * lastNumber + c) % m;
            return lastNumber;
        }
    }
}