public class Robot1 {
    private int x;
    private int y;

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setX(int x) {
        this.x = x;
    }
    //Координаты на которых стоит робот
    public void move(int x, int y) {
//        //координаты, на которые нужно будет передвинуться
//        while (this.x < x) {
//            //пока текущие координаты меньше чем нам требуются, выводим в консоль
//            System.out.println("Двигаемся по оси x от " + this.x + " до " + (++this.x));

       this.x = print(this.x, y, "x");
       this.y = print(this.y, y, "y");
    }
    public int print(int start, int end, String axisName){
        while (start < end) {
            System.out.println("Двигаемся по оси " + axisName + " от " + start + " до " + (++start));
        }
        return start;
    }
}