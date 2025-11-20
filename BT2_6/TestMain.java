package BT2_6;

public class TestMain {
    public static void main(String[] args ){
        Mypoint m1 = new Mypoint();
        System.out.println(m1);
        m1.setX(8);
        m1.setY(6);
        System.out.println("x is: " + m1.getX());
        System.out.println("y is: " + m1.getY());
        m1.setXY(3,0);
        System.out.println(m1.getXY()[0]);
        System.out.println(m1.getXY()[1]);

        Mypoint m2 = new Mypoint(0,4);
        System.out.println(m2);
        System.out.println(m1.distance(m2));
        System.out.println(m2.distance(m1));
        System.out.println(m1.distance(5,6));
        System.out.println(m1.distance());

//        Mypoint[] points = new Mypoint[10];
//        for ( int i=0; i<points.length; i++){
//            int z= i+1;
//            points[i] = new Mypoint(z,z);
//            System.out.println("tạo thành công");
//        }
//        for ( int i=0; i< points.length; i++){
//            System.out.println("điểm" + (i+1) + ": "+ points[i]);
//        }
    }
}
