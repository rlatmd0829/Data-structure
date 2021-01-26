
import java.util.*;

public class Ex1932_DP {

    static int[][] arr;
    static Integer[][] dp;
    static int N;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        arr = new int[N][N];
        dp = new Integer[N][N];

        // 배열 초기화
        for(int i=0; i<N; i++){
            for(int j=0; j<i+1; j++){ // 피라미드 모양 이므로 j<i+1
                arr[i][j] = sc.nextInt();
            }
        }

        // 가장 마지막 행의 값들을 DP의 마지막 행에도 똑같이 복사
        for(int i=0; i<N; i++){
            dp[N-1][i] = arr[N-1][i];
        }
        System.out.println(find(0,0));


    }

    static int find(int depth, int idx){
        // 마지막 행일 경우 현재 위치의 dp값 반환
        if(depth == N-1) return dp[depth][idx];

        // 탐색하지 않았던 값일 경우 다음 행의 양쪽 값 비교
        if(dp[depth][idx] == null){ // 두수중에 큰수랑 원래 arr[][] 배열안에 원래값이랑 더한값이 dp[][] 값이 된다.
            dp[depth][idx] = Math.max(find(depth+1, idx), find(depth+1, idx+1)) + arr[depth][idx];
        }
        return dp[depth][idx];
    }
}