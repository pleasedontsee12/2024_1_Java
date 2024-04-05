import java.io.*;
import java.util.*;



class H1_Random{
    public static void main(String[] args) throws IOException{
        Random_1 rnd1 = new Random_1(5);
        Random_1 rnd2 = new Random_1(7);
        
        System.out.printf("Seed5 max : %d, Seed 7 max : %d",rnd1.get_max(),rnd2.get_max());
    }
}