import java.io.*;
import java.util.*;

class Random_2{
    int seed;
    int r;
    int[] rnum;
    int max;

    Random_2(int seed){
        this.seed = seed;
        rnum = new int[3];
        setRnums(seed);
        setMax();
    }
    
    void setRnums(int seed){
        Random rnd = new Random(this.seed);
        for(int i = 0; i < 3; i++){
            rnum[i] = rnd.nextInt();
        }
    }

    void setMax(){
        max = rnum[0];
        for(int i = 0; i < 3; i++){
            if(rnum[i] > max){
                max = rnum[i];
            }
        }
    }

    int outRnums(){
        int sum = 0;
        for(int i = 0; i < 3; i++){
            System.out.println("seed[" + seed + "]" + "의 " +"rnum["+i+"] : "+ rnum[i]);
            sum += rnum[i];
        }
        return sum;
    }

    int get_max(){
        return max;
    }
}

class H2_Random{
    public static void main(String[] args) throws IOException{
        Random_2 rnd1 = new Random_2(5);
        Random_2 rnd2 = new Random_2(7);

        System.out.printf("Seed5 add : %d, Seed7 add : %d\n",rnd1.outRnums(),rnd2.outRnums());
        System.out.printf("Seed5 Max : %d, Seed7 Max : %d\n",rnd1.get_max(),rnd2.get_max());
    }
}