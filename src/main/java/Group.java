


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Group { // 1316번 그룹단어 문제
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        int count=0;
        for(int i=0; i<T; i++){
            String str = sc.nextLine();
            boolean arr[] = new boolean[26];
            int prev = 0;
            boolean check = true;
            for(int j=0; j<str.length(); j++){
                int now = str.charAt(j);

                if(prev != now){
                    if(arr[now-'a'] == false){ // 문자가 처음나오는 경우
                        arr[now-'a']=true;
                        prev = now;
                    }
                    else{  // 문자가 이미 나왔었던 경우 (그룹 단어가 아니게됨)
                        check = false;
                        break;

                    }
                }
                else{ // 앞선 문자와 지금 문자가 같은경우
                    continue;
                }

            }
            if(check == true) {
                count++;
            }
        }
        System.out.println(count);




    }
}
