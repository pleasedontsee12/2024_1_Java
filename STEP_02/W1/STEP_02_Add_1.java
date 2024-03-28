import java.io.*;

class Add_01{
    int total;

    int add2i(int a, int b){
        int s;
        s = a + b;
        total = s;
        return (s);
    }

    float add2f(float a, float b){
        float s;
        s = a + b;
        total += s; // s(float) != total(int)
        return s;
    }

    int add2if(int a, float b){
        float s;
        s = a + b;
        total += s;
        return (int)s;
    } 

    float add2fi(float a, int b){
        float s;
        s = a + b;
        total += s;
        return (s);
    }

}

class STEP_02_Add_1{
    public static void main(String[] args) throws IOException{
        int i,j,k;
        float x,y,z;
        
        i = System.in.read() - '0'; x = i;
        j = System.in.read() - '0'; y = j;

        Add_01 add01;
        add01 = new Add_01();
        k = add01.add2if(i,j);
        //z = add.add2if(x,y);
        
        System.out.printf("%d + %d = %d\n",i,j,k);
        
    }
}