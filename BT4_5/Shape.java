package BT4_5;

public abstract class Shape {
    private String color;
    private boolean filled;
    public Shape(){}

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public boolean getfilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }
    public boolean isFilled(){
        return filled=true;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    @Override
    public String toString() {
        return "Shape{color=" + color + ",filled=" + filled + "}";
    }
}
