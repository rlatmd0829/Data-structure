import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Ex1463_DP {
    static int[] arr;
    public static void main(String[] args) throws IOException {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 0;
        for(int i=2; i<=n; i++){ // 2부터 n까지 횟수 조사해서 dp에 넣는다
            dp[i] = dp[i-1] +1; // -1 빼기 저장
            if(i % 2 ==0){
                dp[i] = Math.min(dp[i], dp[i/2]+1); // i가 2로 나눠지면 2로 나누는것과 1로 빼는 것중에 최소값을 찾아서 저장
            }
            if(i % 3 ==0){
                dp[i] = Math.min(dp[i], dp[i/3]+1);
            }
        }
        System.out.println(dp[n]);
    }
}
