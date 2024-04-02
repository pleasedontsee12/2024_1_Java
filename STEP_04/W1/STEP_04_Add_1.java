import java.io.*;

class STEP_04_Add_1{
    public static void main(String[] args) throws IOException{
        Add_1 add1;
        Add_2 add2;
        int x,y,z;
        float a,b,c;
        x = System.in.read() -'0'; a = (float)x;
        y = System.in.read() -'0'; b = (float)y;
        z = add1.add2c(x,y);
        c = add2.add2f(a,b);
        System.out.printf("Integer : %d + %d = %d",x,y,z);
        System.out.printf("float : %d + %d = %d",a,b,c);
    }
}

class Add_1{
    int total;
    int add2c(int a, int b){
        int s;
        int a + b;
        total += s;
        return s;
    }
}

class Add_2{
    int total;
    int add2f(float a, float b){
        int s;
        int a + b;
        total += s;
        return s;
    }
}

