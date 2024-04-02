import java.io.*;

class STEP_04_Add_1{
    public static void main(String[] args) throws IOException{
        Add_1 add1 = new Add_1();
        Add_2 add2 = new Add_2();
        int x,y,z;
        float a,b,c;
        x = System.in.read() -'0'; a = (float)x;
        y = System.in.read() -'0'; b = (float)y;
        z = add1.add2c(x,y);
        c = add2.add2f(a,b);
        System.out.printf("Integer : %d + %d = %d\n",x,y,z);
        System.out.printf("float : %f + %f = %f",a,b,c);
    }
}


