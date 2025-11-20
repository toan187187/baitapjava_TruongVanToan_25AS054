package BT4_4;

public class MovablePoint extends Point{
    private float xSpeed=0.0f;
    private float ySpeed= 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(){}

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float[] getSpeed(){
        float[] speed = new float[2];
        speed[0] = getxSpeed();
        speed[1] = getySpeed();
        return speed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" + super.toString()+
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }


    public MovablePoint move(){
        setX(getX()+ xSpeed);
        setY(getY()+ySpeed);
        return this;
    }
}
