import java.util.Scanner;

public class Backtracking {
    public static int[] arr;
    public static boolean[] visit;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 숫자의 개수
        int M = sc.nextInt(); // 깊이 값

        arr = new int[M]; // 자리수 M이 3이면 x,x,x 4이면 x,x,x,x
        visit = new boolean[N];
        dfs(N,M,0);
    }

    public static void dfs(int N, int M, int depth){
        if(depth == M){
            for(int val : arr){
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }
        for(int i=0; i<N; i++){
            if(!visit[i]){
                visit[i] = true;
                arr[depth] =i+1;
                dfs(N,M,depth+1);
                visit[i] = false;
            }
        }
    }


}
