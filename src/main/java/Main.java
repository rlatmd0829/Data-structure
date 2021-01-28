import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {



    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};



        System.out.println(solution(n));



    }
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        for(int i=0; i<strings.length; i++){
            String str = strings[i];
            char[] c = str.toCharArray();
            for(int j=0; j<c.length; j++){
                int max = 0;
                if(max < c[j]-'0'){
                    max = c[j]-'0';
                }
            }
        }
        return answer;
    }
    
}
