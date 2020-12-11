


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;


public class OX { // 8958 문제 배낌
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        String str[] = new String[T];

        for(int i=0; i<T; i++){
            str[i] = sc.nextLine();

        }

        for(int i=0; i<str.length; i++){
            int cnt =0;
            int sum = 0;
            for(int j=0; j<str[i].length(); j++) {
                if (str[i].charAt(j) == 'O') { // O가 연속되면 연속된만큼 추가점수
                    cnt++;
                }
                else{
                    cnt = 0;  // 연속이 끊기면 초기화
                }
                sum += cnt;
            }
            System.out.println(sum);
        }




    }

}

