import java.io.*;

class Point_2{
    int x;
    int y;

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

class STEP_05_02_Point2{
    public static void main(String[] args) throws IOException{
        Point_2 pnt1 = new Point_2();
        Point_2 pnt2 = new Point_2();

        int x1,y1,x2,y2;
        double dl;
        x1 = System.in.read(); y1 = System.in.read();
        x2 = System.in.read(); y2 = System.in.read();

        pnt1.set_xy(x1,y1);
        pnt2.set_xy(x2,y2);

        dl = Math.sqrt(Math.pow(pnt1.get_x() - pnt2.get_x(),2) + Math.pow(pnt1.get_y() - pnt2.get_y(),2));
        System.out.printf("%f",dl);
    }
}