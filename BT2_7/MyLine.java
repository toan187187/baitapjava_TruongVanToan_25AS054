package BT2_7;

import BT2_6.Mypoint;

public class MyLine {
    private Mypoint begin;
    private Mypoint end;

    public MyLine(int x1, int y1, int x2, int y2){
        this.begin = new Mypoint(x1, y1);
        this.end = new Mypoint(x2,y2);
    }

    public MyLine(Mypoint begin, Mypoint end){
        this.begin = begin;
        this.end = end;
    }

    public Mypoint getBegin() {
        return begin;
    }

    public void setBegin(Mypoint begin) {
        this.begin = begin;
    }

    public Mypoint getEnd() {
        return end;
    }

    public void setEnd(Mypoint end) {
        this.end = end;
    }

    public int getBeginX(){
        return begin.getX();
    }

    public void setBeginX(int x){
        this.begin.setX(x);
    }

    public int getBeginY(){
        return begin.getY();
    }

    public void setBeginY(int y){
        this.begin.setY(y);
    }
    public int getEndX(){
        return end.getX();
    }

    public void setEndX(int x){
        this.end.setX(x);
    }

    public int getEndY(){
        return end.getY();
    }

    public void setEndY(int y){
        this.end.setY(y);
    }

    public int[] getBeginXY(){
        int[] xy = new int[2];
        xy[0] = begin.getY();
        xy[1] = begin.getX();
        return xy;
    }

    public void setBeginXY(int x, int y){
        this.begin.setXY(x,y);
    }

    public int[] getEndXY(){
        int[] xy = new int[2];
        xy[0] = end.getX();
        xy[1] = end.getY();
        return xy;
    }

    public void setEndXY(int x, int y){
        this.end.setXY(x,y);
    }

    public double getLength(){
        return begin.distance();
    }

    public double getGradient(){
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.atan2(yDiff,xDiff);
    }

    public String toString(){
        return "MyLine[begin="+begin+", end="+end+"]";
    }
}
