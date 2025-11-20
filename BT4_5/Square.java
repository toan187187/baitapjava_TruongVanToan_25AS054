package BT4_5;

public class Square extends Rectangle{
    public Square(){
        super();
    }

    public Square(double side){
        super(side,side);
    }

    public Square(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
       super.setWidth(side);
       super.setLength(side);
    }

    public void setWidth(double side) {
        setSide(side);
    }

    public void setLength(double side) {
        setSide(side);
    }

    public String toString() {
        // Lấy side thông qua getSide()
        return "Square[" + super.toString() + ", side=" + getSide() + "]";
    }

}
