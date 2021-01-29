import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {



    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};


        System.out.println('a'-'0');



    }
    boolean solution(String s) {

        char c [] = s.toCharArray();

        int pcnt=0;
        int ycnt=0;
        for(int i=0; i<c.length-1; i++){
            if(c[i]=='p' || c[i]=='P'){
                pcnt++;
            }
            else if(c[i] == 'y' || c[i] == 'Y'){
                ycnt++;
            }
        }
        if(pcnt == ycnt){
            return true;
        }
        else {
            return false;
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        //System.out.println("Hello Java");


    }
    
}
