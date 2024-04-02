import java.io.*;

class H2_Multiply{
    public static void main(String[] args) throws IOException{
        Multiply mul1 = new Multiply();
        int x,y,z;
        float a,b,c;
        x = System.in.read() -'0'; a = (float)x;
        y = System.in.read() -'0'; b = (float)y;
        z = mul1.mul2c(x,y);
        c = mul1.mul2c(a,b);
        System.out.printf("Integer : %d * %d = %d\n",x,y,z);
        System.out.printf("float : %f * %f = %f",a,b,c);
    }
}



