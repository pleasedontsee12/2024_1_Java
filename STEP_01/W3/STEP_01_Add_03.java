import java.io.*;

class Add_03{
    static int add2i(int x, int y){
        int s;
        s = x + y;
        return s;
    }
}

class STEP_01_Add_03{
    public static void main(String[] args) throws IOException{
        int x,y,z;
        x = System.in.read() - '0';
        y = System.in.read() - '0';
        z = Add_03.add2i(x,y);

        System.out.printf("%d + %d = %d",x,y,z);
    } 
}