import java.io.*;
import line.Line;

class H1_Pointline{
    public static void main(String[] args) throws IOException{
        Line ln = new Line(5, 8, 1, 4);
        double ans = ln.get_dl();
        System.out.println("dl : " + ans);
    }
}