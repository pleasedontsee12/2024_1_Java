import java.io.*;

class MyRndException_31 extends Exception{ }
class MyModException_32 extends Exception{ }

class Get_n_3{
    int getnum() throws MyRndException_31{
        int n;
        n = (int)(Math.random() * 10);
        System.out.println(n);
        if(n == 0){
            throw new MyRndException_31();
        }
        
        return n;
    }
}

class Get_m_3{
    Get_n_3 gn;
    Get_m_3(Get_n_3 gn){
        this.gn = gn;
    }

    int getmod() throws MyRndException_31{
        int x,y,m;

        try{
            if((x = gn.getnum()) < 0 || (y = gn.getnum()) < 0  || (m = (x % y)) == 0){
                throw new MyModException_32();
                }
        } catch(MyModException_32 e) {
            System.out.println("MyModException_22");
            return -1;
        }

        System.out.println(x + " " + y);
        return m;
    }
}

class STEP_11_Exception_3{
    public static void main(String[] args) throws MyRndException_31 {
        Get_n_3 rd = new Get_n_3();
        Get_m_3 md = new Get_m_3(rd);
        int m;

        while(true){
            if((m = md.getmod()) < 0){
                break;
            }
            System.out.println("--> " + m);
        }
        System.out.println("S..t..op...");
    }
}