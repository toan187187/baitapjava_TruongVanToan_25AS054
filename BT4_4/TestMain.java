package BT4_4;

public class TestMain {
    public static void main(String[] args){
        MovablePoint mp1 = new MovablePoint(2.0f, 3.0f, 10.0f, 20.0f);
        System.out.println("Ban đầu: " + mp1);

        mp1.move();
        System.out.println("Sau khi move(): " +mp1);

        mp1.move();
        System.out.println("Sau khi move() lần 2: " +mp1);
    }
}
