package BT2_7;

import BT2_6.Mypoint;

import java.util.Arrays;

public class TestMain {
    public static void main(String[] args){
        MyLine l1 = new MyLine(0,0,3,4);
        System.out.println("l1: "+l1);

        Mypoint p1 = new Mypoint(1,2);
        Mypoint p2 = new Mypoint(5,8);
        MyLine l2 = new MyLine(p1,p2);
        System.out.println("l2: "+l2);

        System.out.println("l1-Diem bat dau: "+ l1.getBegin());
        System.out.println("l2-Diem ket thuc: "+ l1.getEnd());

        l1.setBegin(new Mypoint(1,1));
        l2.setEnd(new Mypoint(2,2));
        System.out.println("l1 (sau khi set): "+l1);

        System.out.println("l2-Begin x: "+ l2.getBeginX());
        System.out.println("l2-Begin y: "+ l2.getBeginY());
        System.out.println("l2-End x: "+ l2.getEndX());
        System.out.println("l2-End y: "+ l2.getEndY());

        l2.setBeginX(0);
        l2.setBeginY(0);
        l2.setEndX(10);
        l2.setEndY(5);
        System.out.println("l2 (sau khi set x,y): "+ l2);

        System.out.println("L1 - Begin XY: " + Arrays.toString(l1.getBeginXY()));
        System.out.println("L1 - End XY: " + Arrays.toString(l1.getEndXY()));

        l1.setBeginXY(5,5);
        l1.setEndXY(10,10);
        System.out.println("l1 (sau khi setXY): "+l1);

        System.out.println("l1 - Do dai: "+ l1.getLength());
        System.out.println("l2 - Do dai: "+ l2.getLength());

        System.out.println("l1 - Gradient: "+ l1.getGradient());
        System.out.println("l2 - Gradient: "+ l2.getGradient());
    }
}
