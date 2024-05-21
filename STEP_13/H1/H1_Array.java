import java.io.*;
import java.util.*;

public class H1_Array {
    static int[][] arr1 = new int[2][3];
    static int[][] arr2 = new int[2][3];
    static int[][] arr3 = new int[2][3];


    public static void add_Arr() {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
    }

    public static void ini_Arr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int)(Math.random() * 100);
            }
        }
    }

    public static void prt_Arr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf(" arr[%d][%d]:%2d", i,j,arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------");
    }

    public static void main(String[] args) {
        ini_Arr(arr1);
        prt_Arr(arr1);
        ini_Arr(arr2);
        prt_Arr(arr2);
        add_Arr();
        prt_Arr(arr3);
        
    }
}