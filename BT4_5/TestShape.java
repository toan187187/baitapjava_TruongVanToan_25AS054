package BT4_5;

public class TestShape {
    public static void  main(String[] args){
        Shape c1 = new Circle("blue", false, 5.7);
        System.out.println(c1);
        System.out.println("Diện tích Circle: " + c1.getArea());
        System.out.println("Chu vi Circle: " + c1.getPerimeter());
        System.out.println();
        Shape c2= new Rectangle("green",true,2,3);
        System.out.println(c2);
        System.out.println("Diện tích Rectangle: "+c2.getArea());
        System.out.println("Chu vi Rectangle: "+c2.getPerimeter());
        System.out.println();
        Shape c3= new Square("red", true, 3,3);
        System.out.println(c3);
        System.out.println("Diện tích Square: "+ c3.getArea());
        System.out.println("Chu vi Square: "+c3.getPerimeter());
        System.out.println();

    }
}
