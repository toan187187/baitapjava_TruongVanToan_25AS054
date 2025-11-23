package BT6_4;

interface Movable {
    public abstract void  moveUp();
    public abstract void moveDown();
    public abstract void moveLeft();
    public abstract void moveRight();
}

class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString(){
        return "(" + x +"," + y+ ") speed=(" +x+ "," +y+")";
    }

    public void moveUp(){
        y -= ySpeed;
    }

    public void moveDown(){
        y += ySpeed;
    }

    public void moveLeft(){
        x -=  xSpeed;
    }

    public void moveRight(){
        x += xSpeed;
    }
}

class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.center = new MovablePoint(x,y,xSpeed, ySpeed);
        this.radius = radius;
    }

    public String toString(){
        return center.toString()+ ",radius= " + radius;
    }

    public void moveUp(){
        center.moveUp();
    }

    public void moveDown(){
        center.moveDown();
    }

    public void moveLeft(){
        center.moveLeft();
    }

    public void moveRight(){
        center.moveRight();
    }
}

class TestMain{
    public static void main(String[] args){
        MovablePoint m1 = new MovablePoint(0,2,5,7);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);

        MovableCircle m2 = new MovableCircle(1,6,3,9,5);
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);
        m2.moveUp();
        System.out.println(m2);
    }
}
