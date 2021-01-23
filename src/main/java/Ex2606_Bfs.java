import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex2606_Bfs {
    static int arr[][];
    static boolean check[];
    static int n,m,cnt=0;
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n+1][n+1];
        check = new boolean[n+1];
        for(int i=1; i<=m; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[x][y] = 1;
            arr[y][x] = 1;
        }

        bfs(1);
        System.out.println(cnt);

    }

    public static int bfs(int k){
        Queue<Integer> qu = new LinkedList();
        qu.offer(k);


        while(!qu.isEmpty()){
            int temp = qu.poll();
            for(int i=1; i<=n; i++){
                if(arr[temp][i]==1 && check[i]==false){
                    qu.offer(i);
                    check[i]=true;
                    cnt++;
                }
            }
        }
        return cnt;

    }
}
