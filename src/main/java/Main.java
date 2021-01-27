import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {



    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};


        int[] abc = solution(array, commands);
        System.out.println("[");
        for(int a : abc){

            System.out.print(a);
            if()
            System.out.println(", ");

        }
        System.out.println("]");



    }
    public static int[] solution(int[] array, int[][] commands) {
        int x=0,y=0,z=0;

        int[] answer = {};
        int [] result ={};
        result = new int[commands.length];
        for(int i=0; i<commands.length; i++){
            int cnt = 0;
            x = commands[i][0];
            y = commands[i][1];
            z = commands[i][2];

            answer = new int[y-x+1];
            for(int j=x; j<=y; j++){

                answer[cnt] = array[j-1];
                cnt++;

            }
            Arrays.sort(answer);


            result[i] = answer[z-1];

        }


        return result;
    }
    
}
