package BT2_9;

import BT2_6.Mypoint;

public class MyTriangle {
    private Mypoint v1;
    private Mypoint v2;
    private Mypoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        this.v1 = new Mypoint(x1,y1);
        this.v2 = new Mypoint(x2,y2);
        this.v3 = new Mypoint(x3, y3);
    }

    public MyTriangle(Mypoint v1, Mypoint v2, Mypoint v3){
        this.v1=v1;
        this.v2=v2;
        this.v3=v3;
    }

    @Override
    public String toString() {
        return "MyTriangle{" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                '}';
    }

    public double getPerimeter() {
        double canh1 = v1.distance(v2);
        double canh2 = v2.distance(v3);
        double canh3 = v3.distance(v1);
        return canh3 + canh1 + canh2;
    }

    public String getType(){
        double canh1 = v1.distance(v2);
        double canh2 = v2.distance(v3);
        double canh3 = v3.distance(v1);
        if ( canh3 == canh1 && canh3 == canh2){
            return "equilateral";
        } else if (canh3==canh1 || canh1==canh2 || canh2==canh3) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }
}
