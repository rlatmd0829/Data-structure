import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {



    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};


        //String a[] = solution(1132548);
        System.out.println('Z'+1);
        //solution("abc",1);
        //97~122 소문자
        //65~90 대문자

    }
    public static String solution(String s, int n) {
        String answer = "";
        char[] c = s.toCharArray();
        for(int i=0; i<c.length; i++){
            c[i] = (char)(c[i]+n);
            answer += c[i];
        }

        return answer;
    }
    
}
