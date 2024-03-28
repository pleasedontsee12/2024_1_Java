import java.io.*;

class Add_3{
    int total;

    int add2c(int a, int b){
        int s;
        s = a + b;
        total += s;
        System.out.println("add2c(int, int) ...");
        return (s);
    }

    float add2c(float a, float b){
        float s;
        s = a + b;
        total += s;
        System.out.println("add2c(float, float) ...");
        return (s);
    }
    
    int add2c(int a, float b){
        float s;
        s = a + b;
        total += s;
        System.out.println("add2c(int, float) ...");
        return (int)s;
    }

}

class STEP_02_Add_3{
    public static void main(String[] args) throws IOException{
        Add_3 add03;
        int i,j,k,m;
        float x,y,z,w;
        i = System.in.read() - '0'; x = i;
        j = System.in.read() - '0'; y = j;

        add03 = new Add_3();
        k = add03.add2c(i,j);
        z = add03.add2c(x,y);
        m = add03.add2c(i,x);
        w = add03.add2c(x,i);
        System.out.printf("%d + %d = %d(%f)\n",i,j,k,z);
        
    }
}