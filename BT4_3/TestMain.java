package BT4_3;

import static java.lang.System.*;

public class TestMain {
    public static void main(String[] args){
        Point2D p1= new Point2D(1.5f,2.5f);
        System.out.println("Point2D: "+ p1.toString());

        Point3D p2 = new Point3D(10.0f,20.0f,30.0f);
        System.out.println("Point3D: "+ p2.toString());

        p2.setXYZ(5.0f,6.0f,7.0f);
        float[] xyz = p2.getXYZ();
        System.out.println("New Point3D: (" + xyz[0]+ " "+ xyz[1]+ " "+ xyz[2]+")");
    }
}
