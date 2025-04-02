public class Wheels {
    private int count;
    private boolean winter;

    public Wheels(int count, boolean winter) {
        this.count = count;
        this.winter = winter;
    }

    public boolean isWinter() {
        return winter;
    }

    public void setWinter(boolean winter) {
        this.winter = winter;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "count: " + count +
                ", winter: " + winter;
    }
}
