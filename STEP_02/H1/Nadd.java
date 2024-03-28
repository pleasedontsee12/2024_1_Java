import java.io.*;

class Adds{
    int add2i(int n1, int n2){
        return (n1+n2);
    }
    int add3i(int n1, int n2, int n3){
        return (n1+n2+n3);
    } 
    float add2f(float x1, float x2){
        return (x1+x2);
    }
    float add3f(float x1, float x2, float x3){
        return (x1+x2+x3);
    }
}


class Nadd{
    public static void main(String[] args) throws IOException{
        int n1,n2,n3,nsum;
        float x1,x2,x3,xsum;

        n1 = System.in.read() - '0'; x1 = (float)(n1 + 0.1);
        n2 = System.in.read() - '0'; x2 = (float)(n2 + 0.2);
        n3 = System.in.read() - '0'; x3 = (float)(n3 + 0.3);

        Adds Add;
        Add = new Adds();
        nsum = Add.add2i(n1,n2);
        xsum = Add.add3f(x1,x2,x3);

        System.out.printf("nsum = %d, xsum = %f\n", nsum, xsum);

    }
}