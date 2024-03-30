import java.io.*;

class STEP_04_Add_2{
    public static void main(String[] args) throws IOException{
        Add_2 add = new Add_2();
        int x,y,z;
        float a,b,c;

        x = System.in.read() - '0'; a = x;
        y = System.in.read() - '0'; b = y;

        z = add.add2c(x,y);
        c = add.add2c(x,y);
        System.out.printf("%d + %d = %d(%f)\n", x,y,z,c);

    }
}