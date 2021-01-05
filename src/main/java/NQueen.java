import java.io.*;
import java.util.StringTokenizer;


public class NQueen { // 9663번 문제, 백트래킹 대표 문제 답지 안보고 풀어봐야함

    public static int[] arr;
    public static int N;
    public static int count=0;
    public StringBuilder sb;
    static public void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String abc = br.readLine();
        StringTokenizer str = new StringTokenizer(abc);
        N = Integer.parseInt(str.nextToken());

        arr = new int[N];

        dfs(0);
        System.out.println(count);



    }

    public static void dfs(int depth){
        // 모든 원소를 다 채운 상태면 count 증가 및 return
        if(depth == N){
            count++;
            return;
        }
        for(int i=0; i<N; i++){
            arr[depth]=i;
            // 놓을수 있는 위치일 경우 재귀호출
            if(Possibility(depth)){
                dfs(depth+1);
            }
        }

// 1차원 배열로 행과 열 나타냄
        // 1차원 배열에 인덱스(위치)는 열을 가리키고, 해당 인덱스의 값은 행을 의미한다.

    }
    public static boolean Possibility(int col){
        for(int i=0; i<col; i++){
            // 해당 열의 행과 i열의 행이 일치할 경우 (같은 행에 존재할 경우)
            if(arr[col] == arr[i]){
                return false;
            }

            // 대각선상에 놓여있는 경우 ( 열의 차와 행의 차가 같을경우가 대각선에 놓여있는경우다)
            else if(Math.abs(col-i) == Math.abs(arr[col]- arr[i])){
                return false;
            }
        }
        return true;
    }

}