public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xdelta;
    private float ydelta;
    public Ball(float x, float y, int radius, float xdelta, float ydelta){
        // this dùng để tham chiếu đễn đối tượng hiện tại, phân biệt thuộc tính của lớp (this.y) và tham số (y).
        //--- CÁC PHƯƠG THỨC GETTER VÀ SETTER ---
        // Đây là các phương thức cho phép mã bên ngoài đọc (get) và ghi (set) giá trị cho các thuộc tính private.
        this.y=y;
        this.radius=radius;
        this.xdelta=xdelta;
        this.ydelta=ydelta;
    }
    public float getX(){
        return x;
    }
    public void setX(float x){
        this.x=x;
    }
    public float getY(){
        return y;
    }
    public void setY(float y) {
        this.y=y;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public float getXdelta() {
        return xdelta;
    }
    public void setXdelta(float xdelta){
        this.xdelta=xdelta;
    }
    public float getYdelta() {
        return ydelta;
    }
    public void setYdelta(float ydelta) {
        this.ydelta = ydelta;
    }
    public void move(){
        x+=xdelta;   // cập nhật tọa dộ x bằng cách cộng thêm vân tốc xdelta
        y+=ydelta;
    }
    public void reflectHorizontal(){
        xdelta=-xdelta;
    }
    public void reflectVertical(){
        ydelta=-ydelta;
    }
    public String toString() {
        // --- PHƯƠNG THỨC toString() ---

        // Ghi đè phương thức toString() mặc định của Java.
        // Phương thức này trả về một chuỗi ký tự mô tả trạng thái hiện tại của đối tượng Ball.
        // Rất hữu ích cho việc gỡ lỗi (debug), ví dụ: System.out.println(myBall);
        return "Ball{" +
                "x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                ", xdelta=" + xdelta +
                ", ydelta=" + ydelta +
                '}';
    }
}
