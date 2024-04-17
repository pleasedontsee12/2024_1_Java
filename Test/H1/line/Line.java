package line;
import point.*; 

public class Line extends Point{
    int a;
    int b;

    public Line(int x, int y, int a, int b){
        super(x,y);
        this.a = a;
        this.b = b;
    }

    void set_ab(int a, int b){
        this.a = a;
        this.b = b;
    }

    int get_a() {
        return a;
    }

    void set_a(int a) {
        this.a = a;
    }

    int get_b() {
        return b;
    }

    void setB(int b) {
        this.b = b;
    }

   public  double get_dl(){
        double dl;
        dl = Math.sqrt(Math.pow(get_x() - a, 2) + Math.pow(get_y() - b, 2));
        return dl;
    }
}