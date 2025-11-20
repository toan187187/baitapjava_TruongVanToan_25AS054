package BT4_3;

public class Point3D extends Point2D{
    private float z =0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        super.setXY(x,y);
        this.z=z;
    }
    public float[] getXYZ(){
        float[] Z= new float[3];
        Z[0] = getX();
        Z[1] = getY();
        Z[2] = getZ();
        return Z;
    }

    @Override
    public String toString() {
        return "Point3D{" + super.toString() +
                "z=" + z +
                '}';
    }
}
