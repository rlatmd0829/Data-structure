import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {

    static int arr[];

    static public void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int n = fac(x);
        int r = fac(y)*fac(x-y);

        System.out.println((n/r)%10007);



    }

    static int fac(int a){
        if(a==0){
            return 1;
        }
        else{
            return a * fac(a-1);
        }
    }
}