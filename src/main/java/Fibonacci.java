import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Fibonacci { // 1003번 문제, DP 다이나믹 프로그래밍 기초문제, 0과 1이 출력되는 횟수, (DP는 점화식(규칙) 구하는게 가장중요하다 종이에 써보면서 생각해보자)

    static Integer[][] dp = new Integer[41][2]; // null 이용하기 위해 Integer 배열 사용

    static public void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        dp[0][0] = 1; // N=0 일 때의 0 호출 횟수
        dp[0][1] = 0; // N=0 일 때의 1 호출 횟수
        dp[1][0] = 0; // N=1 일 때의 0 호출 횟수
        dp[1][1] = 1; // N=1 일 때의 1 호출 횟수


        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){


            int a = Integer.parseInt(br.readLine());
            fibonacci(a);
            sb.append(dp[a][0] + " " + dp[a][1]).append('\n');

        }
        System.out.println(sb);
    }
    public static Integer[] fibonacci(int n){
        // n에 대한 0, 1의 호출 횟수가 없을 때 (아직 저장된 값이 없을때, 즉 처음인경우)
        if(dp[n][0] == null || dp[n][1] == null){
            dp[n][0] = fibonacci(n-1)[0] + fibonacci(n-2)[0];
            dp[n][1] = fibonacci(n-1)[1] + fibonacci(n-2)[1];
        }
        // n에 대한 0과 1, 즉 [n][0]과 [n][1]을 담고있는 [n]을 반환한다.
        return dp[n]; // dp[2]가 반환되었다면 dp[2][0]과 dp[2][1]을 담고있는 dp[2]가 반환되었다는 것이다.

    }


}