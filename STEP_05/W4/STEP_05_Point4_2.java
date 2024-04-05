import java.io.IOException;

class Point4_2{
    int x,y;

    Point4_2(){
        x = 9;
        y = 9;
    }

    Point4_2(int x){
        this.x = x;
        y = 9;
    }

    Point4_2(int x, int y){
        this.x = x;
        this.y = y;
    }

    void set_xy(int x, int y){
        this.x = x;
        this.y = y;
    }

    void set_x(int x){
        this.x = x;
    }

    void set_y(int y){
        this.y = y;
    }

    int get_x(){
        return x;
    }

    int get_y(){
        return y;
    }
}

public class STEP_05_Point4_2 {
    public static void main(String[] args) throws IOException{
        int x1,y1,x2,y2;
        double dl;
        Point4_2 pnt1;
        Point4_2 pnt2;

        x1 = System.in.read() - '0';
        y1 = System.in.read() - '0';
        x2 = System.in.read() - '0';
        y2 = System.in.read() - '0';

        pnt1 = new Point4_2(x1, y1);
        pnt2 = new Point4_2(x2, y2);

        dl = Math.sqrt(Math.pow(pnt1.get_x() - pnt2.get_x(),2) + Math.pow(pnt1.get_y() - pnt2.get_y(),2));
        
        System.out.printf("%f",dl);
    } 
}
