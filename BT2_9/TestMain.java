package BT2_9;

import BT2_6.Mypoint;

public class TestMain {
    public static void main(String[] args){
        System.out.println("Scalene");
        MyTriangle t1 = new MyTriangle(0,0,3,0,0,4);
        System.out.println("Tọa độ: " +t1);
        System.out.println("Chu vi: " +t1.getPerimeter());
        System.out.println("Loại: " +t1.getType());
        System.out.println("Isosceles");

        Mypoint p1 = new Mypoint(0,0);
        Mypoint p2 = new Mypoint(6,0);
        Mypoint p3 = new Mypoint(3,5);

        MyTriangle t2 = new MyTriangle(p1,p2,p3);

        System.out.println("tọa độ: "+ t2);
        System.out.println("chu vi: "+ t2.getPerimeter());
        System.out.println("loại: "+ t2.getType());
    }
}
