package BT2_6;

public class Mypoint {
    private int x=0;
    private int y=0;

    public Mypoint() {
    }

    public Mypoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY(){
        int[] xy  = new int[2];
        xy[0] = x;
        xy[1] = y;
        return  xy;
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Mypoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double distance(int x, int y){
        int xDiff = this.x-x;
        int yDiff = this.y-y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public double distance(Mypoint another){
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return this.distance(another.x, another.y);
    }

    public double distance(){
        return this.distance(0,0);
    }
}
