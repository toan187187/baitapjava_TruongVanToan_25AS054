package BT6_3;

interface Movable {
    public abstract void  moveUp();
    public abstract void moveDown();
    public abstract void moveLeft();
    public abstract void moveRight();
}

class MovablePoint implements Movable{
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

class TestMain{
    public static void main(String[] args){
        MovablePoint m1 = new MovablePoint(0,0,10,20);
        System.out.println(m1);
        m1.moveUp();
        System.out.println(m1);
        m1.moveDown();
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
        m1.moveRight();
        System.out.println(m1);
    }
}