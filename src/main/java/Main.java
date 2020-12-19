


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    static public void main(String[] args) throws IOException {
       Scanner  sc = new Scanner(System.in);
       int T = sc.nextInt();
       int arr[][] = new int[15][14];

       for(int i=0; i<15; i++){
           arr[i][1] = 1;
           arr[0][i] = i;
       }

       for(int i=1; i<15; i++){
           for(int j=1; j<15; j++){
                arr[i][j] = arr[i-1][j]+arr[i][j-1];
           }
       }

       for(int i=0; i<T; i++){
           int a = sc.nextInt();
           int b = sc.nextInt();
           System.out.println(arr[a][b]);
       }
    }

}

