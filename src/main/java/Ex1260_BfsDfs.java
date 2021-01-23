import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Ex1260_BfsDfs {
    static int[][] arr;
    static boolean[] check;
    static StringBuilder sb = new StringBuilder();
    static int n,m,v;
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        v = sc.nextInt();

        arr = new int[n+1][n+1];   // 좌표를 그대로 받아드리기 위해 n+1
        check = new boolean[n+1];

        for(int i=0; i<m; i++){ // 노드와 간선에 대한 입력값 받아서 간선처리
            int s = sc.nextInt();
            int e = sc.nextInt();
            arr[s][e] = 1;
            arr[e][s] = 1;
        }

        dfs(v);
        sb.append("\n");
        Arrays.fill(check, false); // check 배열 초기화
        bfs(v);
        System.out.println(sb);
    }

    public static void dfs(int start){
        //경로 출력
        sb.append(start+" ");
        //현재 노드 방문 처리
        check[start] = true;

        for(int i=1; i<=n; i++){
            if(arr[start][i] == 1 && check[i] == false){
                dfs(i); // 내가 찾은 경로가 만약에 다른 경로가 있으면
                // 바로 다음 곳으로 이동시키고 없으면 다시 리커해서 돌아오는 방식임
            }
        }
    }

    public static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        check[start] = true;
        // 방문한위치 check true 만들어줌
        while (!q.isEmpty()){
            int temp = q.poll();
            // 첫번째 방문한 위치는 빼주기로한다.
            sb.append(temp+ " ");

            for(int i=1; i<=n; i++){
                if(arr[temp][i] == 1 && check[i]==false){
                    q.offer(i);
                    check[i] = true; // true라면 방문을 한거임
                }
            }
        }
    }

}