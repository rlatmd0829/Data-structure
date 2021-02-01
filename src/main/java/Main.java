import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {



    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};


        String a[] = solution(1132548);
        for(String i : a){
            System.out.println(i);
        }
        System.out.println();



    }
    public static String solution(long n) {
        String[] array = String.valueOf(n).split("");
        Collections.reverse(Arrays.asList(array));
        answer = Long.parseLong(String.join("", array));
        return answer;
    }
    
}
