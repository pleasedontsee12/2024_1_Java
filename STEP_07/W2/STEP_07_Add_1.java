package STEP_07.W2;
import java.io.*;

class STEP_07_Add_1{
    public static void main(String[] args) throws IOException{
        STEP_07.W2.work.Add_1 add = new STEP_07.W2.work.Add_1();
        int x,y,z;
        float a,b,c;

        x = System.in.read() - '0'; a = x;
        y = System.in.read() - '0'; b = y;

        z = add.add2c(x,y);
        c = add.add2c(x,y);
        System.out.printf("%d + %d = %d(%f)\n", x,y,z,c);

    }
}