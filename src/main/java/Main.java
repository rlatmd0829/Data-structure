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
        solution(12345);
        //solution("abc",1);
        //97~122 소문자
        //65~90 대문자

    }
    public static Integer[] solution(long n) {
        Integer[] answer = {};
        String s = Long.toString(n);
        String str[] = s.split("");
        answer = new Integer[str.length];
        for(int i=0; i<str.length; i++){
            answer[i] = Integer.parseInt(str[i]);
        }

       

        List<Integer> list = Arrays.asList(answer);
        Collections.reverse(list);
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
    
}
