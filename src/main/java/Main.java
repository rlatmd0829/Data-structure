


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();


        for(int i=0; i<T; i++){
            int aud = sc.nextInt();
            float sum = 0;
            float avg = 0;
            float cnt=0;
            float arr[] = new float[aud];
            for(int j=0; j<aud; j++){
                arr[j] = sc.nextInt();
                sum += arr[j];
            }

            avg = sum/aud;
            for(int j=0; j<aud; j++) {
                if (arr[j] > avg) {

                    cnt++;
                }
            }

            System.out.printf("%.3f",(cnt/aud)*100);
            System.out.println("%");
        }

    }
}

