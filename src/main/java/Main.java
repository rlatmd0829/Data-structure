


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i=0;
        int sum=0;
        while (true){
            int x=0;
            if(i==0){
                x=1;
            }else {
                x = 6 * i;
            }
            sum += x;
            i++;
            if(sum>=N){
                break;
            }

        }
        System.out.println(i);



   }
}

