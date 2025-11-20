package BT2_8;

import BT2_6.Mypoint;

public class TestMain {
    public static void main(String[] args){
        MyCircle c1 = new MyCircle();
        System.out.println("c1: "+c1);

        MyCircle c2 = new MyCircle(2,3,5);
        System.out.println(c2);

        Mypoint p1 = new Mypoint(2,3);
        MyCircle c3 = new MyCircle(p1,4);
        System.out.println("c3: "+c3);

        c1.setRadius(10);
        c1.setCenterXY(5,5);
        System.out.println("c1: "+c1);
        System.out.println("Tâm c1: "+ c1.getCenterX());

        System.out.println("Diện tích c2: "+ c2.getArea());
        System.out.println("Chu vi c2: "+ c2.getCircumference());

        double dist = c1.distance(c2);
        System.out.println("khoảng cách c1, c2: "+ dist);
    }
}
