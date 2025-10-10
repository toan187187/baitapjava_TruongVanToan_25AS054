public class Circle1_1 {
    private double radius = 1.0;
    private String color = "red";
    public Circle1_1() {
    }
    public Circle1_1(double r) {
        this.radius = r;
    }
    public double getRadius() {
        return this.radius;
    }
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }
    public String getColor() {
        return this.color;
    }
}