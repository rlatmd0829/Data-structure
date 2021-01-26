import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex2178_Bfs {
    static int arr[][];
    static boolean check[][];
    static int n,m;
    static int cnt;
    static int[][] pos = {{1,0}, {-1,0}, {0,1}, {0,-1}}; // 우, 좌, 상, 하
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n][m];
        check = new boolean[n][m];
        for(int i=0; i<n; i++){
            String str = sc.next();
            for(int j=0; j<m; j++){
                arr[i][j] = str.charAt(j)-'0';
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j]==1 && check[i][j]==false){
                    //bfs(i,j);
                }
            }
        }
    }

//    public static int bfs(int x, int y){
//        Queue<Integer> qu = new LinkedList();
//        qu.offer(x);
//
//
//        while(!qu.isEmpty()){
//            int temp = qu.poll();
//            for(int i=1; i<4; i++){
//                int nx = x + pos[i][0];
//                int ny = y + pos[i][1];
//                if(nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny]==1 && check[nx][ny] == false){
//                    bfs(nx, ny);
//                }
//            }
//        }
//        return cnt;

//    }
}
