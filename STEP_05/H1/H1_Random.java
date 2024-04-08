import java.io.*;
import java.util.*;

class Random_1{
    int seed;
    int max;
    int[] rnum = new int[10];
    
    Random_1(int seed){
        this.seed = seed;
        Random rnd = new Random(seed);

        for(int i = 0; i < 10; i++){
            int r = rnd.nextInt();
            rnum[i] = r;
            
            if(max < rnum[i]){
                max = rnum[i];
            }
        }
    }

    int get_max(){
        return max;
    }

}
class H1_Random{
    public static void main(String[] args) throws IOException{
        Random_1 rnd1 = new Random_1(5);
        Random_1 rnd2 = new Random_1(7);
        
        System.out.printf("Seed5 max : %d \nSeed7 max : %d",rnd1.get_max(),rnd2.get_max());
    }
}