// 자바 프로그램의 키보드 입력과 문자 코드
// %c는 입력된 문자의 10진수값, %x는 16진수 값
// System.in.read는 띄어쓰기까지 인식하므로 입력시 붙여서 쓰기
// 숫자 - '0'은 그 숫자에 대응되는 수치값
import java.io.*;

class Input{
    public static void main(String[] args) throws IOException{
        int x,y,z;
        x = System.in.read();
        y = System.in.read();
        z = (x - '0') + (y - '0');
        

        System.out.printf("x = %c, %d(%x), y = %c, %d(%x)\n",x,x,x,y,y,y);
        System.out.printf("%c + %c = %d\n",x,y,z);
    }
}

/*
Input : 12 
Output: x = 1,49(31), y=2,50(32)
        1+2=3
 */