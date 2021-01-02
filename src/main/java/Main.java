


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    static public void main(String[] args) throws IOException {
       Scanner  sc = new Scanner(System.in);
       int x = sc.nextInt();
       int y = sc.nextInt();
       int w = sc.nextInt();
       int h = sc.nextInt();

       int m = 0;
       int n=0;

       if(w-x < x){
           m = w-x;
       }
       else{
           m = x;
       }

       if(h-y < y){
           n = h-y;
       }
       else{
           n=y;
       }

       if(m>n){
           System.out.println(n);
       }
       else{
           System.out.println(m);
       }
    }


}

