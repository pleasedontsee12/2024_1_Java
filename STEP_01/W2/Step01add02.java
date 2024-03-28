import java.io.IOException;
//클래스 분리하기

class Add02{
    public static int add2i(int a, int b){
        int s;
        s = a+b;
        return (s);
    }
}

class Step01add02{
    public static void main(String[] args) throws IOException{
        int x,y,z;

        x = System.in.read() - '0';
        y = System.in.read() - '0';
        z = Add02.add2i(x,y);

        System.out.printf("%d + %d = %d",x,y,z);
    }
}