package STEP_07.W3.point;

public class Point_3 {
    public int x;
    public int y;

    public Point_3(int x, int y){
        this.x = x;
        this.y = y;
    }

    void set_xy(int x, int y){
        this.x = x;
        this.y = y;
    }

    int get_x() {
        return this.x;
    }

    void set_x(int x) {
        this.x = x;
    }

    int get_y() {
        return this.y;
    }

    void set_y(int y) {
        this.y = y;
    }
}
