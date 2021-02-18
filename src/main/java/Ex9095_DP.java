import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Ex9095_DP {
    static int[] arr;
    public static void main(String[] args) throws IOException {


        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int dp[] = new int[11];
        dp[1] =1;
        dp[2] =2;
        dp[3] =4;
        for(int j=4; j<=10; j++){
            dp[j] = dp[j-3]+ dp[j-2]+ dp[j-1];
        }
        for(int i=0; i<T; i++){
            int n = sc.nextInt();
            System.out.println(dp[n]);
        }

    }
}
