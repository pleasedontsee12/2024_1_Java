import java.io.*;

class Add_02{
    int total;

    Add_02(){

    }
    
    int add2i(int a, int b){
        int s;
        s = a + b;
        total = s;
        return (s);
    }

    int add2f(float a, float b){
        float s;
        s = a + b;
        total = s; // s(float) != total(int)
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

class STEP_02_Add_2{
    public static void main(String[] args) throws IOException{
        Add_02 add;
        int i,j,k;
        float x,y,z;
        z = System.in.read() - '0'; i = (int)x;
        y = System.in.read() - '0'; j = (int)y;

        add = new Add_02();
        k = add.add2if(i,j);
        //z = add.add2if(x,y);
        
        System.out.printf("%d + %d = %d\n",i,j,k);
        
    }
}