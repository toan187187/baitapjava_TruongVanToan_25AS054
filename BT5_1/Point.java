package BT5_1;

class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x=x;
        this.y=y;
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

    public void setXY(int x, int y){
        this.setX(x);
        this.setY(y);
    }

    public String toString(){
        return "Point: (" +x+ ";" + y+ ")";
    }

//    public double distance(int x, int y){
//        int xDiff = this.x - x;
//        int yDiff = this.y - y;
//        return Math.sqrt(Math.pow(xDiff, 2)*Math.pow(yDiff, 2));
//    }
//
//    public double distance(Point another){
//        int xDiff = this.x- another.x;
//        int yDiff = this.x- another.y;
//        return Math.sqrt(Math.pow(xDiff, 2)*Math.pow(yDiff, 2));
//    }
}

//class TestPoint{
//    static void main (String[] args){
//        Point p1= new Point(100,10);
//        System.out.println(p1);
//    }
//}


class Line extends Point{
    private Point begin;
    private Point end;

    public Line(Point begin, Point end){
        super(begin.getX(), begin.getY());
        this.end=end;
    }

    public Line(int beginX, int beginY, int endX, int endY){
        super(beginX,beginY);
        end = new Point(endX, endY);
    }

    public String toString(){
        return "Line[ " + super.toString()+"]";
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public int getBeginX(){
        return getX();
    }

    public int getBeginY(){
        return getY();
    }

    public int getEndX(){
        return end.getX();
    }

    public int getEndY(){
        return end.getY();
    }

    public void setBeginX(int x){
        setX(x);
    }

    public void setBeginY(int y){
        setY(y);
    }

    public void setBeginXY(int x, int y) {
        setXY(x, y);
    }

    public void setEndX(int x){
        setX(x);
    }

    public void setEndY(int y){
        setY(y);
    }

    public void setEndXY(int x, int y){
        setXY(x,y);
    }

    public int getLength(){
        int xDiff = end.getX() - getX();
        int yDiff = end.getY() - getY();
        return (int) Math.sqrt(Math.pow(xDiff,2) * Math.pow(yDiff,2));
    }

    public double getGradient() {
        int xDiff = end.getX() - getX();
        int yDiff = end.getY() - getY();
        return Math.atan2(yDiff, xDiff);
    }
}

class TestLine{
    public static void main(String[] args){
        Line l1 = new Line(0,0,3,4);
        System.out.println(l1);

        Point p1 = new Point(1,2);
        Point p2 = new Point(3,4);
        Line l2 = new Line(p1,p2);
        System.out.println(l2);

        l1.setBeginXY(5,6);
        l1.setEndXY(2,4);
        System.out.println(l1);
        System.out.println(l1.getLength());
        System.out.println(l1.getGradient());
    }
}


