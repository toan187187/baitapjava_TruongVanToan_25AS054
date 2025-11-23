package BT6_5;

interface GeometricObject {
    public double getPerimeter();
    public double getArea();
}

class Circle implements GeometricObject{
    protected double radius;

    public Circle(double radius){
        this.radius =radius;
    }

    @Override
    public String toString(){
        return "Circle[radius="+radius+"]";
    }

    public double getPerimeter(){
        return 2* Math.PI *radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }
}

interface Resizable{
    public void resize(int percent);
}

class ResizableCircle extends Circle implements Resizable{
    public ResizableCircle(double radius){
        super(radius);
    }

    public String toString(){
        return "ResizableCircle[" + super.toString()+ "]";
    }
    @Override
    public void resize(int percent){
        radius *= percent/100.0;
    }
}

class TestMain{
    public static void main(String[] args){
        Circle c1 = new Circle(5.0);
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());

        ResizableCircle r1 = new ResizableCircle(6.0);
        System.out.println(r1);
        r1.resize(40);
        System.out.println(r1);
        System.out.println(r1.getArea());
    }
}
