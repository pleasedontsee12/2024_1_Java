import java.io.*;
//정적함수가 아닌 객체함수
class addadd{
    int isum(int x, int y){
        int total = 0;

        while(x <= y){
            total += x;
            x++;
        }
        return total;
    }
}

class Isum{
    public static void main(String[] args) throws IOException{
        int c1,c2,c3,c4;
        int n1,n2,sum;

        c1 = System.in.read() - '0';
        c2 = System.in.read() - '0';
        c3 = System.in.read() - '0';
        c4 = System.in.read() - '0';

        n1 = c1 * 10 + c2;
        n2 = c3 * 10 + c4;
        
        addadd a;
        a = new addadd();
        sum = a.isum(n1,n2);

        System.out.printf("n1 ~ n2 = %d\n",sum);
   }
}

