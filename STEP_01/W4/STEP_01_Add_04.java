import java.io.*;

class add43{
    int total;
    int addadd(int x, int y){
        int s;
        s = x + y;
        total += s;
        return s;
    }
}

class STEP_01_Add_04{
    public static void main(String[] args) throws IOException{
        int x,y,z,t;
        add43 add43;
        add43 = new add43();
        x = System.in.read() -'0';
        y = System.in.read() -'0';
        z = add43.addadd(x,y);
        t = add43.total;
        
        System.out.printf("%d + %d = %d / total : %d",x,y,z,t);
    }
}