package STEP_07.W3;
import java.io.IOException;

public class STEP_07_PointLine_3 {
    public static void main(String[] args) throws IOException{
        int x,y,a,b;
        double dl;

        x = System.in.read() - '0';
        y = System.in.read() - '0';
        a = System.in.read() - '0';
        b = System.in.read() - '0';

        STEP_07.W3.line.Line_3 line = new STEP_07.W3.line.Line_3(x,y,a,b);
        dl = line.get_dl();
        System.out.println("dl : " + dl);
    }
}
