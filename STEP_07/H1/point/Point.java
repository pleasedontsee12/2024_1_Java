package point;

public class Point{
    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    void set_xy(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int get_x() {
        return this.x;
    }

    void set_x(int x) {
        this.x = x;
    }

    public int get_y() {
        return this.y;
    }

    void set_y(int y) {
        this.y = y;
    }
}