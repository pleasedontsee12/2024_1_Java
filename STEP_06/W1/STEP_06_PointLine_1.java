import java.io.*;

class Point_1{
    int x,y;

    Point_1(int x, int y){
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

class Line_1 extends Point_1{
    int a, b;
    Line_1(int x, int y, int a, int b){
        super(x, y); // 자신이 상속받은 부모의 생성자를 호출하는 메소드 super()
        this.a = a;
        this.b = b;
    }

    void set_ab(int a, int b){
        this.a = a;
        this.b = b;
    }

    void set_a(int a){
        this.a = a;
    }

    void set_b(int b){
        this.b = b;
    }

    int get_a(){
        return a;
    }

    int get_b(){
        return b;
    }
}
// https://velog.io/@rhdmstj17/java.-super%EC%99%80-super-%EC%99%84%EB%B2%BD%ED%95%98%EA%B2%8C-%EC%9D%B4%ED%95%B4%ED%95%98%EA%B8%B0
class STEP_06_PointLine_1{
    public static void main(String[] args) throws IOException{
        Line_1 line;
        int x,y,a,b;
        double dl;

        x = System.in.read() - '0';
        y = System.in.read() - '0';
        a = System.in.read() - '0';
        b = System.in.read() - '0';

        line = new Line_1(x, y, a, b);

        dl = Math.sqrt(Math.pow(line.get_x() - line.get_a(), 2) + Math.pow(line.get_y() - line.get_b(), 2));

        System.out.println("dl = " + dl);
    }
}