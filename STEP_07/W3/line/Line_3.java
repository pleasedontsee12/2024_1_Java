package STEP_07.W3.line;
import STEP_07.W3.*;

public class Line_3 extends point1.Point_3{
    int a;
    int b;

    public Line_3(int x, int y, int a, int b){
        super();
        this.a = a;
        this.b = b;
    }

    void set_ab(int a, int b){
        this.a = a;
        this.b = b;
    }

    int get_a() {
        return this.a;
    }

    void set_a(int a) {
        this.a = a;
    }

    int get_b() {
        return this.b;
    }

    void set_b(int b) {
        this.b = b;
    }

    public double get_dl(){
        double dl;
        dl = Math.sqrt(Math.pow(x - a, 2) + Math.pow(y - b, 2));
        return dl;
    }
    
}
