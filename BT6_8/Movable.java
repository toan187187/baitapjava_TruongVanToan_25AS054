package BT6_8;

interface Movable {
    public void  moveUp();
    public void moveDown();
    public void moveLeft();
    public void moveRight();
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

class MovableCircle implements Movable{
    private MovablePoint center;
    private int radius;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x,y,xSpeed, ySpeed);
        this.radius = radius;
    }

    public void moveUp(){
        center.y -= center.ySpeed;
    }

    public void moveDown(){
        center.y += center.ySpeed;
    }

    public void moveLeft(){
        center.x -= center.xSpeed;
    }

    public void moveRight(){
        center.x += center.xSpeed;
    }
}

class TestMain{
    public static void main(String[] args){
        Movable m1 = new MovablePoint(5, 6, 10, 15);     // upcast
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);

        Movable m2 = new MovableCircle(1, 2, 3, 4, 20);  // upcast
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);
    }
}


