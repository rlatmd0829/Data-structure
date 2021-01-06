import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {

    public static long[] dp = new long[101];
    static public void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0; i<T; i++){
            int N = sc.nextInt();
            dp[0] = 0;
            dp[1] = 1;
            dp[2] = 1;
            dp[3] = 1;
            dp[4] = 2;
            dp[5] = 2;

            for(int j=6; j<=N; j++){
                dp[j]=-1;
            }

            System.out.println(Pado(N));
        }

    }
    public static long Pado(int N){
        if(dp[N]==-1){
            dp[N] = Pado(N-2) + Pado(N-3);
        }
        return dp[N];
    }


}