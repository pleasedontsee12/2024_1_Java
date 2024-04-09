import java.io.*;

class Point_2_1{
    int x;
    int y;

    Point_2_1(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int get_x() {
        return this.x;
    }

    public void set_x(int x) {
        this.x = x;
    }

    public int get_y() {
        return this.y;
    }

    public void set_y(int y) {
        this.y = y;
    }
    
}

class Line_2_1 extends Point_2_1{
    int a;
    int b;
    

    Line_2_1(int x, int y, int a, int b){
        super(x,y);
        this.a = a;
        this.b = b;
    }

    public int get_a() {
        return this.a;
    }

    public void set_a(int a) {
        this.a = a;
    }

    public int get_b() {
        return this.b;
    }

    public void set_b(int b) {
        this.b = b;
    }

    double get_dl(){
        double dl;
        dl = Math.sqrt(Math.pow(x - a, 2) + Math.pow(y - b, 2));
        return dl;
    }

    boolean equalTo(Line_2_1 ln){
        if(ln.get_a() == ln.get_x() && ln.get_b() == ln.get_y()){
            return true;
        }
        else{
            return false;
        }
    }

    boolean compareTwo(Line_2_1 ln1, Line_2_1 ln2){
        if(ln1.get_x() == ln2.get_x() && ln1.get_y() == ln2.get_y() &&
        ln1.get_a() == ln2.get_a() && ln1.get_b() == ln2.get_b()){
            return true;
        }
        else{
            return false;
        }
    }

}

class STEP_06_PointLine_2_1{
    public static void main(String[] args) throws IOException{
        int x,y,a,b;

        x = System.in.read() -'0';
        y = System.in.read() -'0';
        a = System.in.read() -'0';
        b = System.in.read() -'0';

        Line_2_1 line1 = new Line_2_1(x, y, a, b);
        Line_2_1 line2 = new Line_2_1(a, b, x, y);

        double dl1 = line1.get_dl();
        double dl2 = line2.get_dl();

        System.out.println("dl1 : " + dl1 + "\ndl2 : " + dl2);
        System.out.println("b1 : " + line1.equalTo(line2) + "\nb2 : " + line2.compareTwo(line1, line2));
        
    }
}