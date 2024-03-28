// 정적(static)함수 만들기
import java.io.IOException;
class Step01add01{
    public static void main(String[] args) throws IOException{
        int x,y,z;
        x = System.in.read() - '0';
        y = System.in.read() - '0'; //문자열로 받은 숫자를 정수형으로 변경
        z = add2i(x,y);
        System.out.printf("%d + %d = %d", x,y,z);
        
    }

    //여기 빈칸
    static int add2i(int x, int y){
        int s;
        s = x + y;
        return (s);
    }
}

/*
 Input : 
 Output :
 */