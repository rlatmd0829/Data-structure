


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;


public class ASCII {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int T = sc.nextInt();
        String str = sc.next();
        for(int i=0; i<T; i++){
            int x = str.charAt(i)-'0'; // Str을 char로 바꿔준후에 -'0'(아스키 코드 48이고 숫자는 여기부터 시작함) 을 해주면 원하는 int 값을 얻을수 있다.
            sum += x;                   // ASCII코드 값말고 제대로된 값을 받고 싶으면 -'0'을 해주면 된다.
        }
        System.out.println(sum);

    }
}

