


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        List no = new ArrayList();
        new ArrayList();
        int a = sc.nextInt();
        int copy = a;
        int cnt=0;
        while (true) {
//            int a1 = a % 10; // 일의자리
//            int a2 = a / 10; // 십의자리
//            int w = (a1 + a2) % 10; // 일의자리 십의자리 더한값
            a = ((a%10)*10) + (((a%10) + (a/10)) % 10);
            cnt++;

            if(a == copy){
                break;
            }
        }
        System.out.println(cnt);


    }

}

