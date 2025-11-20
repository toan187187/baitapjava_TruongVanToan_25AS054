package BT5_2;

import com.sun.security.jgss.GSSUtil;

class Circle {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    public Circle(){
        this.radius = 0.0f;
        this.color = "red";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return Math.PI  * Math.pow(radius,2);
    }

    public String toString(){
        return "Circle [ color= " + color + ", radius= "+ radius+ "]";
    }
}

class Cylinder{
    private Circle base;
    private double height;

    public Cylinder(){
        this.base = new Circle();
        this.height = 1.0;
    }

    public Cylinder(double radius){
        this.base = new Circle(radius);
        this.height =1.0;
    }
    public Cylinder(double radius, double height) {
        base = new Circle(radius);
        this.height = height;
    }
    public Cylinder(double radius, double height, String color) {
        base = new Circle(radius, color);
        this.height = height;
    }

    public Circle getBase() {
        return base;
    }

    public void setBase(Circle base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return base.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder[base=" + base.toString() + ", height=" + height + "]";
    }
}

class TestCylinder{
    public static void main(String[] args){
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder 1");
        System.out.println("Radius: " + c1.getBase().getRadius());
        System.out.println("Height: " + c1.getHeight());
        System.out.println("Volume: " + c1.getVolume());
        System.out.println(c1);

        Cylinder c2 = new Cylinder(5.0, 2.0,"red");
        System.out.println("Cyclinder 2");
        System.out.println("Radius: " + c2.getBase().getRadius());
        System.out.println("Color: " +c2.getBase().getColor());
        System.out.println("Volume: " + c2.getVolume());
        System.out.println(c2);
    }
}
