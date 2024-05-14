import java.io.*;

class MyRndException extends Exception{ }
class MyModException extends Exception{ }

class Get_n{
    int get_num() {
        int n;

        try {
            n = (int) (Math.random() * 10);
            System.out.println(n);
            if (n == 0) {
                throw new MyRndException_21();
            }
        } catch (MyRndException_21 e) {
            System.out.println("Rnd Error!!");
            return -1;
        }

        return n;
    }
}

class Get_m{
    Get_n gn;
    Get_m(Get_n gn){
        this.gn = gn;
    }

    int getmod(){
        int x,y,m;

        try{

        }catch (MyModException e){
            System.out.println("Mod Error !!");
            return -1;
        }

    }

}

public class STEP_11_Exception_2_2 {
    public static void main(String[] args) throws IOException{

    }
}
