package BT6_2;

interface GeometricObject {
    double getArea();
    double getPerimeter();
}

class Circle implements GeometricObject{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public String toString(){
        return "Circle[ radius= " +radius+ "]";
    }

    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
}

class GeometricOject{
    public static void main(String[] args){
        Circle c1= new Circle(5.0);

        System.out.println(c1);
        System.out.println("Dien tich: " + c1.getArea());
        System.out.println("Chu vi: " + c1.getPerimeter());

        GeometricObject g1 = new Circle(10.0);
        System.out.println("");
        System.out.println("Dien tich cua geoObj: " + g1.getArea());
    }
}
