import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


public class GCD { // 2609, 최대공약수, 최소공배수 구하기

    static int arr[];

    static public void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int gcd = gcd(x,y);
        System.out.println(gcd);
        System.out.println(x*y/gcd); // 최소공배수 = (x * y) / 최대공약수
    }
    static int gcd(int a, int b){ // 유클리드 호제법 최대공약수(GCD) 구하기
        if(b==0){
            return a;
        }else {
            return gcd(b, a%b);
        }
    }
}