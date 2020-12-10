


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int arr[] = new int[26];
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)>='a' && str.charAt(i) <='z') {
                int x = str.charAt(i) - 'a'; // 'a'를 빼주면 a부터 0시작해서 z까지 0~26

                arr[x] += 1;
            }
            else{
                int x = str.charAt(i) - 'A';
                arr[x] += 1;
            }
        }
        int max = 0;
        int cnt = 0;
        int min = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
                cnt = i;
            }
            else if (arr[i]==max){
                min = arr[i];
            }
        }
        if(max == min){
            System.out.println("?");
        }
        else {
            System.out.println((char) (cnt + 'A'));
        }

    }
}

