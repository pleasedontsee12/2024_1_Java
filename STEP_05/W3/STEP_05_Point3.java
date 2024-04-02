import java.io.*;

class Point_3{
    int x;
    int y;

    Point_3(int x, int y){
        set_xy(x,y);
    }

    void set_xy(int x, int y){
        if(x < 0) System.err.println("Value of x is invalid");
        else if(y < 0) System.err.println("Value of y is invalid");
        this.x = x; 
        this.y = y;
    }

    void set_x(int x){
        if(x < 0) System.err.println("Value of x is invalid");
        this.x = x;
    }

    void set_y(int y){
        if(y < 0) System.err.println("Value of y is invalid");
        this.y = y;
    }

    int get_x(){
        return x;
    }

    int get_y(){
        return y;
    }
}

class STEP_05_Point3{
    public static void main(String[] args) throws IOException{
        Point_3 pnt1;
        Point_3 pnt2;

        int x1,y1,x2,y2;
        double dl;
        x1 = System.in.read(); y1 = System.in.read();
        x2 = System.in.read(); y2 = System.in.read();

        pnt1 = new Point_3(x1,y1);
        pnt2 = new Point_3(x2,y2);

        dl = Math.sqrt(Math.pow(pnt1.get_x() - pnt2.get_x(),2) + Math.pow(pnt1.get_y() - pnt2.get_y(),2));
        System.out.printf("%f",dl);
    }
}