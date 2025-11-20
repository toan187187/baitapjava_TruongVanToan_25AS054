package BT2_8;

import BT2_6.Mypoint;

public class MyCircle {
    private Mypoint centre;
    private int radius;

    public MyCircle(){
        this.centre = new Mypoint(0,0);
        this.radius = 1;
    }

    public MyCircle(int x, int y, int radius){
        this.centre = new Mypoint(x,y);
        this.radius = radius;
    }
    public MyCircle(Mypoint centre, int radius) {
        this.centre = centre;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Mypoint getCentre() {
        return centre;
    }

    public void setCentre(Mypoint centre) {
        this.centre = centre;
    }

    public int getCenterX(){
        return this.centre.getX();
    }

    public void setCenterX(int x){
        this.centre.setX(x);
    }

    public int getCenterY(){
        return this.centre.getY();
    }

    public void setCenterY(int y){
        this.centre.setY(y);
    }

    public int[] getCenterXY(){
        int[] xy = new int[2];
        xy[0] = centre.getX();
        xy[1] = centre.getY();
        return xy;
    }

    public void setCenterXY(int x, int y){
        this.centre.setXY(x,y);
    }

    @Override
    public String toString() {
        return "MyCircle{" +
                "centre=" + centre +
                ", radius=" + radius +
                '}';
    }

    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }

    public double getCircumference(){
        return 2 * Math.PI * this.radius;
    }

    public double distance(MyCircle another){
        return this.centre.distance(another.centre);
    }
}
